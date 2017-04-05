DESCRIPTION = "Web application used in Equalizer"

LICENSE = "PHI"
LIC_FILES_CHKSUM = "file://README.md;md5=5cb046c0bbff9e6ce8ad92849c680912"

SRCBRANCH = "master"
SRCREV = "master"
SRC_URI = "git://git@git.phiinnovations.com/cm_comandos_lineares/equalizer-api.git;protocol=ssh"

S = "${WORKDIR}/git"

#Set package files
FILES_${PN} += "/var/www/equalizer/equalizer-api /var/www/equalizer/package.json"

RDEPENDS_${PN} = "bash"

#Do nothing to compile
do_compile () {
}

do_install () {
   install -d ${D}/var/www/equalizer/
   cp -r ${WORKDIR}/git/equalizer-api ${D}/var/www/equalizer
   install -m 755 ${WORKDIR}/git/package.json ${D}/var/www/equalizer
   chown -R root: ${D}/var/www/equalizer/equalizer-api
   chmod -R 755 ${D}/var/www/equalizer/equalizer-api
}

