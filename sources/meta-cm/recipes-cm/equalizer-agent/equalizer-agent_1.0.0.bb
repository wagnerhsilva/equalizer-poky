DESCRIPTION = "SNMP agent extension"

LICENSE = "PHI"
LIC_FILES_CHKSUM = "file://README.md;md5=c8053a644b1ef0a2ad79faf62716dfdd"

SRCBRANCH = "master"
SRCREV = "master"
SRC_URI = " \
            git://git@git.phiinnovations.com/cm_comandos_lineares/equalizer-agent.git;protocol=ssh \
          "
S = "${WORKDIR}/git"

#Set package files
FILES_${PN} += "/home/root/agent_extension.py"

RDEPENDS_${PN} = "python snmp-passpersist"

#Do nothing to compile
do_compile () {
}

do_install () {
   install -d ${D}/home/root/
   install -m 755 ${WORKDIR}/git/agent_extension.py ${D}/home/root/agent_extension.py
}
