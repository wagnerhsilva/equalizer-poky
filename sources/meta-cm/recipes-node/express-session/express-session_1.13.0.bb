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
LICENSE = "ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23efdb85883c5cc9b6cc5b0456666a2b \
                    file://node_modules/depd/LICENSE;md5=89378960d0c54c30539e50c7a78ce846 \
                    file://node_modules/utils-merge/LICENSE;md5=f405e8bc5b8dd65fdb11cf3669fc209b \
                    file://node_modules/parseurl/LICENSE;md5=f2a528765fa86a33fb7f85f3d9a1b5dd \
                    file://node_modules/debug/node_modules/ms/LICENSE;md5=2be2157b55ea281b7f4969d7ba05eea2 \
                    file://node_modules/on-headers/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/uid-safe/LICENSE;md5=3f825386037244eb39944ee13c43e8c3 \
                    file://node_modules/uid-safe/node_modules/base64-url/LICENSE;md5=3311910a0dce33c933a62fcda1ae8b6f \
                    file://node_modules/cookie/LICENSE;md5=59e0d56ebbefa3af208bc0bae1d8087f \
                    file://node_modules/crc/LICENSE;md5=96fda0720658f13fcd8fe9972ae08a77"

SRC_URI = "npm://registry.npmjs.org;name=express-session;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Simple session middleware for Express"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-cookie-signature = "MIT"
LICENSE_${PN}-cookie = "MIT"
LICENSE_${PN}-crc = "MIT"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-depd = "MIT"
LICENSE_${PN}-on-headers = "MIT"
LICENSE_${PN}-parseurl = "MIT"
LICENSE_${PN}-uid-safe-base64-url = "ISC"
LICENSE_${PN}-uid-safe = "MIT"
LICENSE_${PN}-utils-merge = "MIT"
LICENSE_${PN} = "MIT"
