HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"
PE = "1"

BRANCH = "cubieboard7"
SRCREV = "${AUTOREV}"
UBOOT_MAKE_TARGET = "${UBOOT_BINARY}"

SRC_URI = "git://github.com/Linumiz/u-boot.git;branch=${BRANCH} \
	"
S = "${WORKDIR}/git"
