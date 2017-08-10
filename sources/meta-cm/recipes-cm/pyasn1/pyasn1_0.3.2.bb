DESCRIPTION = "ASN.1 types and codecs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://../license-destdir/pyasn1/generic_BSD;md5=3775480a712fc46a69647678acb234cb"

SRCNAME = "pyasn1"
SRC_URI = "https://pypi.python.org/packages/17/a2/266818077dbd002d53ebe5aaaa05a04786256cea8dba1899ac0b832ef028/pyasn1-0.3.2.tar.gz"
SRC_URI[md5sum] = "a014715fe010038dc773cec810cd5ad9"
SRC_URI[sha256sum] = "90bd82e0db59d4319eaf01c2549b34c817d645275fce9ad41bac7429aa380690"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
