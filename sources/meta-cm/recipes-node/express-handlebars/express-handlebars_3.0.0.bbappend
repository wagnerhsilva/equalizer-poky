inherit externalsrc
EXTERNALSRC = "${THISDIR}/express-handlebars"
EXTERNALSRC_BUILD = "${THISDIR}/express-handlebars"

# initial_rev: 23977ad8d532cc24649b6155da023c492d3c7dd0
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
