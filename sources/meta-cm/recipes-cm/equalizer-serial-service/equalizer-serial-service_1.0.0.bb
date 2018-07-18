DESCRIPTION = "Serial service to check sensors in Equalizer"

LICENSE = "PHI"
LIC_FILES_CHKSUM = "file://README.md;md5=63866e428103ff9d6ed5b6d442ff0595"

SRCBRANCH = "master"
SRCREV = "master"
SRC_URI = " \
            git://git@git.phiinnovations.com/cm_comandos_lineares/equalizer_serial_service.git;protocol=ssh \
            file://equalizer-serial.init \
            file://equalizer-serial-start \
          "

inherit update-rc.d

S = "${WORKDIR}/git"

#Set package files
FILES_${PN} += "/var/www/serial_service"

RDEPENDS_${PN} = "bash sqlite3"

do_install () {
   install -d ${D}/var/www/serial_service/
   install -m 755 ${WORKDIR}/git/service ${D}/var/www/serial_service/
   install -m 755 ${WORKDIR}/equalizer-serial-start ${D}/var/www/serial_service

   install -d ${D}${sysconfdir}/init.d
   install -m 0755 ${WORKDIR}/equalizer-serial.init ${D}${sysconfdir}/init.d/equalizer-serial
   sed -i 's,/usr/sbin/,${sbindir}/,g' ${D}${sysconfdir}/init.d/equalizer-serial
   sed -i 's,/etc/,${sysconfdir}/,g' ${D}${sysconfdir}/init.d/equalizer-serial
}

INITSCRIPT_NAME = "equalizer-serial"
INITSCRIPT_PARAMS = "defaults 94 22"
