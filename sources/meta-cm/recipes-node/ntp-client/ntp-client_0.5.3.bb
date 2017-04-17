# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=9577d784059c05b2e21eafe2ce40dbf0"

SRC_URI = "npm://registry.npmjs.org;name=ntp-client;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Pure Javascript implementation of the NTP Client Protocol"
HOMEPAGE = "https://github.com/moonpyk/node-ntp-client"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "MIT"
