# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "npm://registry.npmjs.org;name=ejs;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Embedded JavaScript templates"
HOMEPAGE = "https://github.com/mde/ejs"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "Apache-2.0"
