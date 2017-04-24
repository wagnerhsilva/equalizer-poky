inherit externalsrc
EXTERNALSRC = "${THISDIR}/morgan"
EXTERNALSRC_BUILD = "${THISDIR}/morgan"

# initial_rev: 4bd7c58127e94a51ca8b5ec62029c6d72feff894
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
