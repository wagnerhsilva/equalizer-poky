inherit externalsrc
EXTERNALSRC = "${THISDIR}/ip"
EXTERNALSRC_BUILD = "${THISDIR}/ip"

# initial_rev: 2e088a052e40f978af3ae9714e3099820a4988e4
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
