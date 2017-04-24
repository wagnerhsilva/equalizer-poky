inherit externalsrc
EXTERNALSRC = "${THISDIR}/body-parser"
EXTERNALSRC_BUILD = "${THISDIR}/body-parser"

# initial_rev: dcd521688abb8471294903866544e1b90a86ec9d
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
