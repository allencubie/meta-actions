require linux.inc

LINUX_KERNEL_TYPE = "mainline"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"
DEFAULT_PREFERENCE = "-1"

SRCREV = "${AUTOREV}"
PV = "4.19-rc6"
KBRANCH = "master"
PATCHTOOL = "git"
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;branch=${KBRANCH} \
	   file://defconfig \
	"
