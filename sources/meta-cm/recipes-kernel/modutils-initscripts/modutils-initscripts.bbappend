FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
 
SRC_URI += " \
    file://kernel-modules-start \
"
 
do_install_append() {
    # The extra files need to go in the respective directories
    install -m 0644    ${WORKDIR}/kernel-modules-start       ${D}${sysconfdir}/modules
}
