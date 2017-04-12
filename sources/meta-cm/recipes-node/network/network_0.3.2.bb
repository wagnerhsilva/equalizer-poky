DESCRIPTION = "Network module for nodejs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://network/README.md;md5=df5aed26a0077b1579718e2364472ae8"

SRC_URI = "file://*/"

S = "${WORKDIR}"

#Set package files
FILES_${PN} += "/usr/lib/node_modules/network"

RDEPENDS_${PN} = "bash"

#Do nothing to compile
do_compile () {
}

do_install () {
   install -d ${D}/usr/lib/node_modules/
   cp -r ${WORKDIR}/network ${D}/usr/lib/node_modules/
   chown -R root: ${D}/usr/lib/node_modules/network
   chmod -R 755 ${D}/usr/lib/node_modules/network
}

