require u-boot-common_${PV}.inc
require u-boot.inc

DEPENDS += "bc-native dtc-native coreutils-native"

PATCHTOOL = "git"
SRC_URI += "file://0001-Change-comments-formet-to-ISO-C90.patch \
		file://0002-gcc8-compiler-header-for-u-boot.patch \
		file://0003-mmc-refer-relative-path-for-headers.patch \
		file://0004-libfdl-fdt-header-reference-conflict-multipe-definit.patch \
		file://bootloader.bin \
	"

do_compile_append() {
	cd ${B}
	dd if=/dev/zero of=./uboot_fill.bin bs=1 count=$( expr $( expr $( expr $(stat -c%s $1) + 511 ) / 512 ) \* 512 )
	dd if=./uboot_fill.bin of=${UBOOT_BINARY} bs=1 skip=$(stat -c%s ${UBOOT_BINARY}) seek=$(stat -c%s ${UBOOT_BINARY})
	rm ./uboot_fill.bin
	cd -
}

do_install_append() {
	install -Dm 0644 ${WORKDIR}/bootloader.bin ${D}/boot/bootloader.bin
}

do_deploy_append() {
	install -Dm 0644 ${WORKDIR}/bootloader.bin ${DEPLOYDIR}/bootloader.bin
}

FILES_${PN} += "bootloader.bin"
