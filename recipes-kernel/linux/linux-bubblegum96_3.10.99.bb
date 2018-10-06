require linux.inc

LINUX_KERNEL_TYPE = "bubblegum96"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"
KBUILD_DEFCONFIG ?= "bubblegum_linux_defconfig"
DEFAULT_PREFERENCE = "-1"
SRCREV = "${AUTOREV}"
PV = "3.10.99"
KBRANCH = "bubblegum96-3.10"

SRC_URI = "git://github.com/96boards-bubblegum/linux.git;protocol=https;branch=bubblegum96-3.10;name=kernel \
           file://0001-compiler-gcc-integrate-the-various-compiler-gcc-345-.patch \
           file://0002-arm64-kill-off-the-libgcc-dependency.patch \
	   file://3.12-039-142-give-up-on-gcc-ilog2-constant-optimizations.patch \
          "
