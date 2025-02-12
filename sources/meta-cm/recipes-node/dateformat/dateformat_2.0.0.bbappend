inherit externalsrc
EXTERNALSRC = "${THISDIR}/dateformat"
EXTERNALSRC_BUILD = "${THISDIR}/dateformat"

# initial_rev: 7dc36806ff541d25880c80bd0a4caa99fb5bb84b
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
