inherit externalsrc
EXTERNALSRC = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/sntp"
EXTERNALSRC_BUILD = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/sntp"

# initial_rev: ae9e63075363cc55cdc831846d1634f1c753493c
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
