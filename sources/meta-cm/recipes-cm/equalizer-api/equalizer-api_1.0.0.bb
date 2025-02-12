DESCRIPTION = "Web application used in Equalizer"

LICENSE = "PHI"
LIC_FILES_CHKSUM = "file://README.md;md5=8b2c37dddc68eb038d318eb62f4b9e69"

SRCBRANCH = "master"
SRCREV = "master"
SRC_URI = " \
            git://git@github.com/wagnerhsilva/equalizer-api.git;protocol=ssh \
            file://equalizer-api.init \
            file://equalizer-api-start \
            file://delete_logs.sh \
          "

inherit update-rc.d

S = "${WORKDIR}/git"

#Set package files
FILES_${PN} += "/var/www/equalizer/equalizer-api /var/www/equalizer/package.json"

RDEPENDS_${PN} = "bash"

#Do nothing to compile
do_compile () {
}

do_install () {
   install -d ${D}/var/www/equalizer-api/
   cp -r ${WORKDIR}/git/equalizer-api ${D}/var/www/equalizer-api
   install -m 755 ${WORKDIR}/git/package.json ${D}/var/www/equalizer-api
   install -m 755 ${WORKDIR}/equalizer-api-start ${D}/var/www/equalizer-api
   install -m 755 ${WORKDIR}/delete_logs.sh ${D}/var/www/equalizer-api
   chown -R root: ${D}/var/www/equalizer-api/equalizer-api
   chmod -R 755 ${D}/var/www/equalizer-api/equalizer-api
   rm -rf ${D}/var/www/equalizer-api/equalizer-api/node_modules
   ln -s /usr/lib/node_modules ${D}/var/www/equalizer-api/equalizer-api/node_modules

   install -d ${D}${sysconfdir}/init.d
   install -m 0755 ${WORKDIR}/equalizer-api.init ${D}${sysconfdir}/init.d/equalizer-api
   sed -i 's,/usr/sbin/,${sbindir}/,g' ${D}${sysconfdir}/init.d/equalizer-api
   sed -i 's,/etc/,${sysconfdir}/,g' ${D}${sysconfdir}/init.d/equalizer-api
}

INITSCRIPT_NAME = "equalizer-api"
INITSCRIPT_PARAMS = "defaults 93 21"
