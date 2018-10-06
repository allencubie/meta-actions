SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel
inherit kernel-yocto 
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_append := "${THISDIR}/${PN}-${PV}:"
S = "${WORKDIR}/git"
