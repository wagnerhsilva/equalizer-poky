FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI += "file://nginxEqualizer.conf "

do_install_append() {
	install -m 0644 ${WORKDIR}/nginxEqualizer.conf ${D}${sysconfdir}/nginx/nginx.conf
}
