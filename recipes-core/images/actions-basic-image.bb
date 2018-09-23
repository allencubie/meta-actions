SUMMARY = "Base image for actions board"
HOMEPAGE = "https://www.linumiz.com"

include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "kernel-modules"

export IMAGE_BASENAME = "actions-basic-image"
