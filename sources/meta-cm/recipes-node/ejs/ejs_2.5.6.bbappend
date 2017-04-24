inherit externalsrc
EXTERNALSRC = "${THISDIR}/ejs"
EXTERNALSRC_BUILD = "${THISDIR}/ejs"

# initial_rev: 5d27c8e3411a2e304ef99794aa8e6aad4a52ff78
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
