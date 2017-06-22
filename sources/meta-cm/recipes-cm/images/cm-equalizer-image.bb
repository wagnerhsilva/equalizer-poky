SUMMARY = "Imagem Linux a ser usada na Thunderboard para CM Módulos Lineares"

IMAGE_FEATURES += " \
	debug-tweaks \
	package-management \
	ssh-server-dropbear \
"
VIRTUAL-RUNTIME_init_manager = "systemd"

IMAGE_INSTALL = "packagegroup-core-boot packagegroup-cm-equalizer init-ifupdown ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

PREFERRED_PROVIDER_udev = "systemd"
PREFERRED_PROVIDER_udev-utils = "systemd"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "1800000"
IMAGE_OVERHEAD_FACTOR = "1.0"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
