# Copyright (C) 2012-2015 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRC_URI = "git://git@github.com/wagnerhsilva/linux-cm.git;protocol=ssh;branch=${SRCBRANCH} \
           file://defconfig"
LOCALVERSION = "-cm"
