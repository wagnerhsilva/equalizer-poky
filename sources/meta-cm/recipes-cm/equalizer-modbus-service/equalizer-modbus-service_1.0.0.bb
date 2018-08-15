DESCRIPTION = "Modbus service to check sensors in Equalizer"

LICENSE = "PHI"
LIC_FILES_CHKSUM = "file://README.md;md5=63866e428103ff9d6ed5b6d442ff0595"

SRCBRANCH = "master"
SRCREV = "master"
SRC_URI = " \
            git://git@git.phiinnovations.com/cm_comandos_lineares/equalizer-modbus-service.git;protocol=ssh \
            file://equalizer-modbus.init \
            file://equalizer-modbus-start \
          "

inherit update-rc.d

S = "${WORKDIR}/git"

#Set package files
FILES_${PN} += "/var/www/modbus_service"

RDEPENDS_${PN} = "bash sqlite3"

do_install () {
   install -d ${D}/var/www/modbus_service
   install -d ${D}/usr/lib
   install -m 755 ${WORKDIR}/git/modbus ${D}/var/www/modbus_service
   install -m 755 ${WORKDIR}/libmodbus.so.5 ${D}/usr/lib
   install -m 755 ${WORKDIR}/equalizer-modbus-start ${D}/var/www/modbus_service

   install -d ${D}${sysconfdir}/init.d
   install -m 0755 ${WORKDIR}/equalizer-modbus.init ${D}${sysconfdir}/init.d/equalizer-modbus
   sed -i 's,/usr/sbin/,${sbindir}/,g' ${D}${sysconfdir}/init.d/equalizer-modbus
   sed -i 's,/etc/,${sysconfdir}/,g' ${D}${sysconfdir}/init.d/equalizer-modbus
}

INITSCRIPT_NAME = "equalizer-modbus"
INITSCRIPT_PARAMS = "defaults 94 22"
