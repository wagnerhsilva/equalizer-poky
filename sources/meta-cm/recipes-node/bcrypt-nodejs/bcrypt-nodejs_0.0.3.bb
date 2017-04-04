# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6de756756ab98c54dcdb50f3fb5e7558"

SRC_URI = "npm://registry.npmjs.org;name=bcrypt-nodejs;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "A native JS bcrypt library for NodeJS."
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "Unknown"
