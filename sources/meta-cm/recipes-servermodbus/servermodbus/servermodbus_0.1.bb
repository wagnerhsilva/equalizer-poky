SUMMARY = "Modbus server for the CM project"
SECTION = "servermodbus"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://*.cpp"

S = "${WORKDIR}"
RDEPENDS_${PN} = "bash sqlite3"

inherit update-rc.d

do_compile() {
	     oe_runmake
}

do_install() {
	     install -d ${D}/var/www/modbus_service
         install -d ${D}/usr/lib
	     install -m 0755 modbus ${D}/var/www/modbus_service
         install -m 0755 ${WORKDIR}/libmodbus.so.5 ${D}/usr/lib
         install -m 0755 ${WORKDIR}/modbus-start ${D}/var/www/modbus_service

         install -d ${D}${sysconfdir}/init.d
         install -m 0755 ${WORKDIR}/modbus-server.init ${D}${sysconfdir}/init.d/modbus-server
         sed -i 's,/usr/sbin/,${sbindir}/,g' ${D}${sysconfdir}/init.d/modbus-server
         sed -i 's,/etc/,${sysconfdir}/,g' ${D}${sysconfdir}/init.d/modbus-server
}

INITSCRIPT_NAME = "modbus-server"
INITSCRIPT_PARAMS = "defaults 94 22"
