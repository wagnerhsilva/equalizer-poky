# Copyright (C) 2012-2015 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Kernel Linux para o Equalizer da CM"
DESCRIPTION = "Linux kernel based on mainline kernel used by FSL Community BSP in order to \
provide support for some backported features and fixes, or because it was applied in linux-next \
and takes some time to become part of a stable version, or because it is not applicable for \
upstreaming."

include linux-cm.inc

PV = "4.4"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"

COMPATIBLE_MACHINE = "mx6ul"
