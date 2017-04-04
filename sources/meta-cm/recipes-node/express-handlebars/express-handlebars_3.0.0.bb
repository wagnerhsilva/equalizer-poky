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
LICENSE = "OR & ISC & BSD-3-Clause & BSD-2-Clause & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f4bf044f76c49f1141283dc9be4ed382 \
                    file://node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/object.assign/LICENSE;md5=2b439ca9e99134dee172a7cc6d989174 \
                    file://node_modules/object.assign/node_modules/function-bind/LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2 \
                    file://node_modules/object.assign/node_modules/object-keys/LICENSE;md5=0026e638d7d5c5f2768864ce0074f8ad \
                    file://node_modules/object.assign/node_modules/define-properties/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/object.assign/node_modules/define-properties/node_modules/foreach/LICENSE;md5=b2225091caf5effa363ef7016fa2b0ba \
                    file://node_modules/object.assign/node_modules/define-properties/node_modules/object-keys/LICENSE;md5=0026e638d7d5c5f2768864ce0074f8ad \
                    file://node_modules/handlebars/LICENSE;md5=f9c332d266d014f0a7c58341370ce085 \
                    file://node_modules/handlebars/node_modules/optimist/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/handlebars/node_modules/optimist/node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/handlebars/node_modules/optimist/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/handlebars/node_modules/source-map/node_modules/amdefine/LICENSE;md5=539b1c7ad0ada7756d6d01b9db20f680 \
                    file://node_modules/handlebars/node_modules/async/LICENSE;md5=dc113e0fc4029c29942399ad22425402 \
                    file://node_modules/handlebars/node_modules/uglify-js/LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/decamelize/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/camelcase/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/LICENSE.txt;md5=83623193d3051ca8068a89a455c699ca \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/right-align/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/right-align/node_modules/align-text/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/right-align/node_modules/align-text/node_modules/longest/LICENSE;md5=360e60c9b7aa16428ee600ff20935e1f \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/right-align/node_modules/align-text/node_modules/kind-of/LICENSE;md5=fad3c8b9c04b365012f3d6821f2dda61 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/right-align/node_modules/align-text/node_modules/kind-of/node_modules/is-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/right-align/node_modules/align-text/node_modules/repeat-string/LICENSE;md5=fad3c8b9c04b365012f3d6821f2dda61 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/center-align/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/center-align/node_modules/align-text/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/center-align/node_modules/align-text/node_modules/longest/LICENSE;md5=360e60c9b7aa16428ee600ff20935e1f \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/center-align/node_modules/align-text/node_modules/kind-of/LICENSE;md5=fad3c8b9c04b365012f3d6821f2dda61 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/center-align/node_modules/align-text/node_modules/kind-of/node_modules/is-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/center-align/node_modules/align-text/node_modules/repeat-string/LICENSE;md5=fad3c8b9c04b365012f3d6821f2dda61 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/cliui/node_modules/center-align/node_modules/lazy-cache/LICENSE;md5=a0bd3ad96ad6f399ce73b75ce8332105 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/yargs/node_modules/window-size/LICENSE-MIT;md5=356865268599668702955e0728242b7e \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/source-map/LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44 \
                    file://node_modules/handlebars/node_modules/uglify-js/node_modules/uglify-to-browserify/LICENSE;md5=10d1d4024d61361102888126d4347f7b \
                    file://node_modules/promise/LICENSE;md5=f908224ab18e60b4c2428c7ef33361e7 \
                    file://node_modules/promise/node_modules/asap/LICENSE.md;md5=6ef000dc4ca2360ae9216d401862c653"

SRC_URI = "npm://registry.npmjs.org;name=express-handlebars;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "A Handlebars view engine for Express which doesn't suck."
HOMEPAGE = "https://github.com/ericf/express-handlebars"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-glob-inflight-once = "ISC"
LICENSE_${PN}-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-glob-inflight = "ISC"
LICENSE_${PN}-glob-inherits = "ISC"
LICENSE_${PN}-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-glob-minimatch = "ISC"
LICENSE_${PN}-glob-once-wrappy = "ISC"
LICENSE_${PN}-glob-once = "ISC"
LICENSE_${PN}-glob-path-is-absolute = "MIT"
LICENSE_${PN}-glob = "ISC"
LICENSE_${PN}-graceful-fs = "ISC"
LICENSE_${PN}-handlebars-async = "MIT"
LICENSE_${PN}-handlebars-optimist-minimist = "MIT"
LICENSE_${PN}-handlebars-optimist-wordwrap = "MIT"
LICENSE_${PN}-handlebars-optimist = "MIT"
LICENSE_${PN}-handlebars-source-map-amdefine = "BSD-3-Clause OR MIT"
LICENSE_${PN}-handlebars-source-map = "BSD-3-Clause"
LICENSE_${PN}-handlebars-uglify-js-source-map = "BSD-3-Clause"
LICENSE_${PN}-handlebars-uglify-js-uglify-to-browserify = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-camelcase = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-center-align-align-text-kind-of-is-buffer = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-center-align-align-text-kind-of = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-center-align-align-text-longest = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-center-align-align-text-repeat-string = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-center-align-align-text = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-center-align-lazy-cache = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-center-align = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-right-align-align-text-kind-of-is-buffer = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-right-align-align-text-kind-of = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-right-align-align-text-longest = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-right-align-align-text-repeat-string = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-right-align-align-text = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui-right-align = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-cliui = "ISC"
LICENSE_${PN}-handlebars-uglify-js-yargs-decamelize = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs-window-size = "MIT"
LICENSE_${PN}-handlebars-uglify-js-yargs = "MIT"
LICENSE_${PN}-handlebars-uglify-js = "BSD-2-Clause"
LICENSE_${PN}-handlebars = "MIT"
LICENSE_${PN}-object.assign-define-properties-foreach = "MIT"
LICENSE_${PN}-object.assign-define-properties-object-keys = "MIT"
LICENSE_${PN}-object.assign-define-properties = "MIT"
LICENSE_${PN}-object.assign-function-bind = "MIT"
LICENSE_${PN}-object.assign-object-keys = "MIT"
LICENSE_${PN}-object.assign = "MIT"
LICENSE_${PN}-promise-asap = "MIT"
LICENSE_${PN}-promise = "MIT"
LICENSE_${PN} = "BSD-3-Clause"
