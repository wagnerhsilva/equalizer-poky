inherit externalsrc
EXTERNALSRC = "${THISDIR}/ntp-client"
EXTERNALSRC_BUILD = "${THISDIR}/ntp-client"

# initial_rev: 8269e0487668b7b66432bcc3ce7fe1087b0818cb
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
