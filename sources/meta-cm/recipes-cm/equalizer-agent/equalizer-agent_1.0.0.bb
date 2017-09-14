DESCRIPTION = "SNMP agent extension"

LICENSE = "PHI"
LIC_FILES_CHKSUM = "file://README.md;md5=c8053a644b1ef0a2ad79faf62716dfdd"

SRCBRANCH = "master"
SRCREV = "master"
SRC_URI = " \
            git://git@git.phiinnovations.com/cm_comandos_lineares/equalizer-agent.git;protocol=ssh \
          "
S = "${WORKDIR}/git"

inherit update-rc.d

#Set package files
FILES_${PN} += "/var/www/equalizer-agent/agent_extension.py \
		/var/www/equalizer-agent/db_engine.py \
		/var/www/equalizer-agent/element_mib.json \
		/var/www/equalizer-agent/trap_sender.py \
"

RDEPENDS_${PN} = "python snmp-passpersist bash"

#Do nothing to compile
do_compile () {
}

do_install () {
   install -d ${D}/var/www/equalizer-agent/
   install -m 755 ${WORKDIR}/git/agent_extension.py ${D}/var/www/equalizer-agent/agent_extension.py
   install -m 755 ${WORKDIR}/git/db_engine.py ${D}/var/www/equalizer-agent/db_engine.py
   install -m 755 ${WORKDIR}/git/element_mib.json ${D}/var/www/equalizer-agent/element_mib.json
   install -m 755 ${WORKDIR}/git/trap_sender.py ${D}/var/www/equalizer-agent/trap_sender.py

   install -d ${D}${sysconfdir}/init.d
   install -m 0755 ${WORKDIR}/git/equalizer-traps ${D}${sysconfdir}/init.d/equalizer-traps
   sed -i 's,/usr/sbin/,${sbindir}/,g' ${D}${sysconfdir}/init.d/equalizer-traps
   sed -i 's,/etc/,${sysconfdir}/,g' ${D}${sysconfdir}/init.d/equalizer-traps
}

INITSCRIPT_NAME = "equalizer-traps"
INITSCRIPT_PARAMS = ""
