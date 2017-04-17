# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5f8e34def90da184aa7c2b2116019331"

SRC_URI = "npm://registry.npmjs.org;name=nodemailer;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Easy as cake e-mail sending from your Node.js applications"
HOMEPAGE = "https://nodemailer.com/"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "MIT"
