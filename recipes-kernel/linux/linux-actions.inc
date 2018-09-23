SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel
inherit kernel-yocto 
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_append := "${THISDIR}/${PN}-${PV}:"

LINUX_KERNEL_TYPE = "actions"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"
KBUILD_DEFCONFIG ?= "s700_cb7_linux_defconfig"

SRC_URI = "git://github.com/Linumiz/linux.git;branch=${KBRANCH} \
		file://0001-Add-gcc8-compiler-header.patch \
	"
S = "${WORKDIR}/git"
