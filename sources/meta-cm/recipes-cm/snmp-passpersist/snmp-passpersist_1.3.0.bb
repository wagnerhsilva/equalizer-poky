DESCRIPTION = "SNMP passpersist backend for Net-SNMP"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://../license-destdir/snmp-passpersist/generic_GPLv3;md5=c79ff39f19dfec6d293b95dea7b07891"

HOMEPAGE = "https://github.com/nagius/snmp_passpersist.git"
SRCNAME = "snmp_passpersist"
SRC_URI = "https://pypi.python.org/packages/a3/bd/aff67e2da7f65bfc2243030d414f927c14c7f7bc4b19db2f3dead51797be/snmp_passpersist-1.3.0.tar.gz"
SRC_URI[md5sum] = "8680ea404d2fbe906b06256a2acf0ccb"
SRC_URI[sha256sum] = "2aa010a4d38025c71282b03b3e47f37110eee348aeea39a71d7561b7d1cfc3d9"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
