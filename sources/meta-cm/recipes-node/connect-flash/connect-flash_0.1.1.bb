# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95ca2874231d1b4d06ca94c35aa604f7"

SRC_URI = "npm://registry.npmjs.org;name=connect-flash;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Flash message middleware for Connect."
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "MIT"
