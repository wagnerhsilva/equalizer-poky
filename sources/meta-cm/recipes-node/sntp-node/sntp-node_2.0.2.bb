# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ce2a96fc8315e28c47cc7b470e4ccdb \
                    file://node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d"

SRC_URI = "npm://registry.npmjs.org;name=sntp;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "SNTP Client"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-hoek = "BSD-3-Clause"
LICENSE_${PN} = "BSD-3-Clause"
