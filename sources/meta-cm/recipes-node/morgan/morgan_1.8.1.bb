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
LIC_FILES_CHKSUM = "file://LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/depd/LICENSE;md5=89378960d0c54c30539e50c7a78ce846 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/on-headers/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/basic-auth/LICENSE;md5=42fffe6fe0b70501d52150ebb52113df \
                    file://node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/on-finished/node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

SRC_URI = "npm://registry.npmjs.org;name=morgan;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "HTTP request logger middleware for node.js"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-basic-auth = "MIT"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-depd = "MIT"
LICENSE_${PN}-on-finished-ee-first = "MIT"
LICENSE_${PN}-on-finished = "MIT"
LICENSE_${PN}-on-headers = "MIT"
LICENSE_${PN} = "MIT"
