inherit externalsrc
EXTERNALSRC = "${THISDIR}/cookie-parser"
EXTERNALSRC_BUILD = "${THISDIR}/cookie-parser"

# initial_rev: d746da5154670fff32f64deb916eaecc32e07ec1
do_install_append() {
    # Remove files added to source dir by devtool/externalsrc
    rm -f ${NPM_INSTALLDIR}/singletask.lock
    rm -rf ${NPM_INSTALLDIR}/.git
    rm -rf ${NPM_INSTALLDIR}/oe-local-files
    for symlink in ${EXTERNALSRC_SYMLINKS} ; do
        rm -f ${NPM_INSTALLDIR}/${symlink%%:*}
    done
}
