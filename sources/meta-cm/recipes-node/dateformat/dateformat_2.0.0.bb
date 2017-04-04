# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a57a36c7c438edd461693e4afcc2377c"

SRC_URI = "npm://registry.npmjs.org;name=dateformat;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "A node.js package for Steven Levithan's excellent dateFormat() function."
HOMEPAGE = "https://github.com/felixge/node-dateformat"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "MIT"
