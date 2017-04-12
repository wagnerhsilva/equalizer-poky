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
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=ed191a4651d2d9d2f46b4e22c98fc801 \
                    file://node_modules/extract-opts/LICENSE.md;md5=33842e752260ba54332ac2220d90e868 \
                    file://node_modules/extract-opts/node_modules/editions/LICENSE.md;md5=62a99672615fb0faaabd018b4f05c3d1 \
                    file://node_modules/extract-opts/node_modules/eachr/LICENSE.md;md5=88707baa8cf551ed2c8a8399579ea6e1 \
                    file://node_modules/extract-opts/node_modules/eachr/node_modules/editions/LICENSE.md;md5=62a99672615fb0faaabd018b4f05c3d1 \
                    file://node_modules/extract-opts/node_modules/eachr/node_modules/typechecker/LICENSE.md;md5=cbbc6b6ffbadf1b215e4201b6ab8ff92 \
                    file://node_modules/extract-opts/node_modules/eachr/node_modules/typechecker/node_modules/editions/LICENSE.md;md5=62a99672615fb0faaabd018b4f05c3d1 \
                    file://node_modules/extract-opts/node_modules/typechecker/LICENSE.md;md5=cbbc6b6ffbadf1b215e4201b6ab8ff92 \
                    file://node_modules/extract-opts/node_modules/typechecker/node_modules/editions/LICENSE.md;md5=62a99672615fb0faaabd018b4f05c3d1"

SRC_URI = "npm://registry.npmjs.org;name=getmac;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Get the mac address of the current machine you are on"
HOMEPAGE = "https://github.com/bevry/getmac"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-extract-opts-eachr-editions = "MIT"
LICENSE_${PN}-extract-opts-eachr-typechecker-editions = "MIT"
LICENSE_${PN}-extract-opts-eachr-typechecker = "MIT"
LICENSE_${PN}-extract-opts-eachr = "MIT"
LICENSE_${PN}-extract-opts-editions = "MIT"
LICENSE_${PN}-extract-opts-typechecker-editions = "MIT"
LICENSE_${PN}-extract-opts-typechecker = "MIT"
LICENSE_${PN}-extract-opts = "MIT"
LICENSE_${PN} = "MIT"
