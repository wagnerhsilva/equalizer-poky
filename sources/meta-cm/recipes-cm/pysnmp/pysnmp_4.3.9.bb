DESCRIPTION = "SNMP library for Python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://../license-destdir/pysnmp/generic_BSD;md5=3775480a712fc46a69647678acb234cb"
RDEPENDS_${PN} += "pyasn1"

SRCNAME = "pysnmp"
SRC_URI = "https://pypi.python.org/packages/fe/80/3512505b6ab865726e9445ba69a4db39417f705f9fdfbbd11f6ca7dddacf/pysnmp-4.3.9.tar.gz"
SRC_URI[md5sum] = "e65746dd6a3e3a9953ac1f100819bcfc"
SRC_URI[sha256sum] = "59c196ce599617ad6f484d20bc61336bff64d3dca4bc99282ba06047248fc70c"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
