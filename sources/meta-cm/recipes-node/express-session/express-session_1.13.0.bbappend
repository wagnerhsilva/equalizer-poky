inherit externalsrc
EXTERNALSRC = "${THISDIR}/express-session"
EXTERNALSRC_BUILD = "${THISDIR}/express-session"

# initial_rev: 6c3ca290c025e0772a89036827b98ea2245f6546
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
