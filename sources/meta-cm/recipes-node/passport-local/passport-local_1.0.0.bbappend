inherit externalsrc
EXTERNALSRC = "${THISDIR}/passport-local"
EXTERNALSRC_BUILD = "${THISDIR}/passport-local"

# initial_rev: ba78ca4311be3f0a7546abfe76abf153afcd8076
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
