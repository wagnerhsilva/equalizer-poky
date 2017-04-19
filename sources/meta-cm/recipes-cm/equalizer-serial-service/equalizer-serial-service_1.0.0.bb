DESCRIPTION = "Serial service to check sensors in Equalizer"

LICENSE = "PHI"
LIC_FILES_CHKSUM = "file://README.md;md5=1bef1c3e1e4b520fb67cd19ad5766063"

SRCBRANCH = "master"
SRCREV = "master"
SRC_URI = "git://git@git.phiinnovations.com/cm_comandos_lineares/equalizer_serial_service.git;protocol=ssh"

S = "${WORKDIR}/git"

#Set package files
FILES_${PN} += "/var/www/serial_service"

RDEPENDS_${PN} = "bash sqlite3"

do_install () {
   install -d ${D}/var/www/serial_service/
   install -m 755 ${WORKDIR}/git/service ${D}/var/www/serial_service/
}


