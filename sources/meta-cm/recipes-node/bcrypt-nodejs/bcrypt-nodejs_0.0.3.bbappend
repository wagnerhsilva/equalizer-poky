inherit externalsrc
EXTERNALSRC = "${THISDIR}/bcrypt-nodejs"
EXTERNALSRC_BUILD = "${THISDIR}/bcrypt-nodejs"

# initial_rev: 96ec3608af088c443ddcdef20c5f6bc5f6152366
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
