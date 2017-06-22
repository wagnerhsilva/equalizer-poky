DESCRIPTION = "Sqlite3 module for nodejs"

LICENSE = "Domain & Apache-2.0 & Unknown & Public & Unlicense & ISC & BSD-3-Clause & BSD-2-Clause & MIT"
LIC_FILES_CHKSUM = "file://sqlite3/LICENSE;md5=79558839a9db3e807e4ae6f8cd100c1c"

SRC_URI = "file://*/"

S = "${WORKDIR}"

#Set package files
FILES_${PN} += "/usr/lib/node_modules/sqlite3"

RDEPENDS_${PN} = "bash"

INSANE_SKIP_${PN}-dev += "staticdev"
INSANE_SKIP_${PN} += "staticdev"

#Do nothing to compile
do_compile () {
}

do_install () {
   install -d ${D}/usr/lib/node_modules/
   cp -r ${WORKDIR}/sqlite3 ${D}/usr/lib/node_modules/
   chown -R root: ${D}/usr/lib/node_modules/sqlite3
   chmod -R 755 ${D}/usr/lib/node_modules/sqlite3
}

