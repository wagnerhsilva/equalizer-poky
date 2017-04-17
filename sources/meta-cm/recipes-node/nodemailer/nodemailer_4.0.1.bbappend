inherit externalsrc
EXTERNALSRC = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/nodemailer"
EXTERNALSRC_BUILD = "/home/prjs/cm_comandos_lineares/equalizer-poky/build/workspace/sources/nodemailer"

# initial_rev: 4b592c134ff355611698fc7c077d5a0ad3468765
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
