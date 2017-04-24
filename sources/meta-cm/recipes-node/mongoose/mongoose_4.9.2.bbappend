inherit externalsrc
EXTERNALSRC = "${THISDIR}/mongoose"
EXTERNALSRC_BUILD = "${THISDIR}/mongoose"

# initial_rev: 7e680e16db8933ec863fb768116feef2581cf027
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
