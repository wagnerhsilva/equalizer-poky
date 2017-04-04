# Provides the i.MX common settings

include conf/machine/include/fsl-default-settings.inc
include conf/machine/include/fsl-default-versions.inc

include conf/machine/include/soc-family.inc

# Set specific make target and binary suffix
PREFERRED_PROVIDER_u-boot ??= "u-boot-fslc"
PREFERRED_PROVIDER_virtual/bootloader ??= "u-boot-fslc"

PREFERRED_PROVIDER_u-boot-mxsboot-native ??= "u-boot-fslc-mxsboot-native"

UBOOT_MAKE_TARGET ?= "u-boot.imx"
UBOOT_MAKE_TARGET_mxs ?= "u-boot.sb"

UBOOT_SUFFIX ?= "imx"
UBOOT_SUFFIX_mxs ?= "sb"

UBOOT_ENTRYPOINT_mxs = "0x40008000"

# Ship kernel modules
MACHINE_EXTRA_RRECOMMENDS = "kernel-modules"

# Sub-architecture support
MACHINE_SOCARCH_SUFFIX ?= ""

INHERIT += "fsl-dynamic-packagearch"

# Firmware
MACHINE_FIRMWARE ?= ""

MACHINE_EXTRA_RRECOMMENDS += "${MACHINE_FIRMWARE}"

# Extra udev rules
MACHINE_EXTRA_RRECOMMENDS += "udev-rules-imx"

# GStreamer 1.0 plugins
MACHINE_GSTREAMER_1_0_PLUGIN ?= ""

# Handle default kernel
IMX_DEFAULT_KERNEL = "linux-cm"
IMX_DEFAULT_KERNEL_mxs = "linux-cm"
PREFERRED_PROVIDER_virtual/kernel ??= "${IMX_DEFAULT_KERNEL}"

SOC_DEFAULT_IMAGE_FSTYPES = "sdcard.gz tar.bz2"
SOC_DEFAULT_IMAGE_FSTYPES_mxs = "uboot.mxsboot-sdcard sdcard.gz tar.bz2"

SDCARD_ROOTFS ?= "${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ext3"
IMAGE_FSTYPES ?= "${SOC_DEFAULT_IMAGE_FSTYPES}"

SERIAL_CONSOLE = "115200 ttymxc0"
SERIAL_CONSOLE_mxs = "115200 ttyAMA0"

KERNEL_IMAGETYPE = "zImage"

MACHINE_FEATURES = "usbgadget usbhost vfat"

# Add the ability to specify _imx machines
MACHINEOVERRIDES =. "imx:"
