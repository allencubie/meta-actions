require linux.inc

LINUX_KERNEL_TYPE = "cubieboard7"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"
KBUILD_DEFCONFIG ?= "s700_cb7_linux_defconfig"
DEFAULT_PREFERENCE = "-1"
SRCREV = "${AUTOREV}"
PV = "3.10.52"
KBRANCH = "cubieboard7"

SRC_URI = "git://github.com/Linumiz/linux.git;branch=${KBRANCH} \
		file://0001-Add-gcc8-compiler-header.patch \
	"
