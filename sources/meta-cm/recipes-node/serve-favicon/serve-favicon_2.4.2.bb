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
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb3d8e3caeeaf0776e84a6eab1116222 \
                    file://node_modules/parseurl/LICENSE;md5=f2a528765fa86a33fb7f85f3d9a1b5dd \
                    file://node_modules/etag/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/fresh/LICENSE;md5=373c2cf0978b37e434394a43b4cbbdb4"

SRC_URI = "npm://registry.npmjs.org;name=serve-favicon;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "favicon serving middleware with caching"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-etag = "MIT"
LICENSE_${PN}-fresh = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-parseurl = "MIT"
LICENSE_${PN} = "MIT"
