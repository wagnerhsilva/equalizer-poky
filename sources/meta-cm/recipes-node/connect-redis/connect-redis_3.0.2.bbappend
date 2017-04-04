inherit externalsrc
EXTERNALSRC = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/connect-redis"
EXTERNALSRC_BUILD = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/connect-redis"

# initial_rev: 600cf44015cd4b918e6243f0003fce10795c6fdd
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
