inherit externalsrc
EXTERNALSRC = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/setup"
EXTERNALSRC_BUILD = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/setup"

# initial_rev: a1bc7443d6b2a8c132cba98cb153796d343e26af
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
