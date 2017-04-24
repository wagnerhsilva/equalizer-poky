inherit externalsrc
EXTERNALSRC = "${THISDIR}/express"
EXTERNALSRC_BUILD = "${THISDIR}/express"

# initial_rev: 573783b34cf47864d15cea8f4d8c77b174de2d82
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
