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
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0fddb2e12b8dac60618cbb5982851510 \
                    file://node_modules/passport-strategy/LICENSE;md5=f694b9c022a5bf0f2c3976a047fed39c"

SRC_URI = "npm://registry.npmjs.org;name=passport-local;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Local username and password authentication strategy for Passport."
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-passport-strategy = "MIT"
LICENSE_${PN} = "MIT"
