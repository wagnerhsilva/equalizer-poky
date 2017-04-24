inherit externalsrc
EXTERNALSRC = "${THISDIR}/serve-favicon"
EXTERNALSRC_BUILD = "${THISDIR}/serve-favicon"

# initial_rev: a26da26b9adecaa7f28f19039a31406fa1bfeaee
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
