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
LICENSE = "Apache-2.0 & Unknown & ISC & Apache & 2.0 & MIT"
LIC_FILES_CHKSUM = "file://node_modules/mongodb/LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47 \
                    file://node_modules/mongodb/node_modules/mongodb-core/LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47 \
                    file://node_modules/mongodb/node_modules/mongodb-core/node_modules/require_optional/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://node_modules/mongodb/node_modules/mongodb-core/node_modules/require_optional/node_modules/resolve-from/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/mongodb/node_modules/mongodb-core/node_modules/require_optional/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/mongodb/node_modules/mongodb-core/node_modules/bson/LICENSE.md;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/mongodb/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/mongodb/node_modules/readable-stream/LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e \
                    file://node_modules/mongodb/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=fcf5cfdc777e49f11402422c72a86f43 \
                    file://node_modules/mongodb/node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/mongodb/node_modules/readable-stream/node_modules/buffer-shims/license.md;md5=e04ef9ec24d382b7576c997066a44835 \
                    file://node_modules/mongodb/node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/mongodb/node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/mongodb/node_modules/readable-stream/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/regexp-clone/LICENSE;md5=8b1369de4e6bcaf26c9b92513526de5e \
                    file://node_modules/kareem/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
                    file://node_modules/mquery/LICENSE;md5=d5a2b7edf2e2d0c1e626e1ba4c8f5d85 \
                    file://node_modules/mquery/node_modules/bluebird/LICENSE;md5=6e915da3b5fbac2898444693555804c8 \
                    file://node_modules/mquery/node_modules/regexp-clone/LICENSE;md5=8b1369de4e6bcaf26c9b92513526de5e \
                    file://node_modules/mquery/node_modules/debug/node_modules/ms/LICENSE;md5=2be2157b55ea281b7f4969d7ba05eea2 \
                    file://node_modules/mquery/node_modules/sliced/LICENSE;md5=d5a2b7edf2e2d0c1e626e1ba4c8f5d85 \
                    file://node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/muri/LICENSE;md5=d5a2b7edf2e2d0c1e626e1ba4c8f5d85 \
                    file://node_modules/async/LICENSE;md5=69e3a003f65943104a65989b5861e66e \
                    file://node_modules/async/node_modules/lodash/LICENSE;md5=8f10c81975f996c3ba5b424884b4af96 \
                    file://node_modules/mpromise/LICENSE;md5=d5a2b7edf2e2d0c1e626e1ba4c8f5d85 \
                    file://node_modules/bson/LICENSE.md;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/mpath/LICENSE;md5=d5a2b7edf2e2d0c1e626e1ba4c8f5d85 \
                    file://node_modules/sliced/LICENSE;md5=d5a2b7edf2e2d0c1e626e1ba4c8f5d85"

SRC_URI = "npm://registry.npmjs.org;name=mongoose;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Mongoose MongoDB ODM"
HOMEPAGE = "http://mongoosejs.com"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-async-lodash = "MIT"
LICENSE_${PN}-async = "MIT"
LICENSE_${PN}-bson = "Apache-2.0"
LICENSE_${PN}-hooks-fixed = "Unknown"
LICENSE_${PN}-kareem = "Apache 2.0"
LICENSE_${PN}-mongodb-es6-promise = "MIT"
LICENSE_${PN}-mongodb-mongodb-core-bson = "Apache-2.0"
LICENSE_${PN}-mongodb-mongodb-core-require-optional-resolve-from = "MIT"
LICENSE_${PN}-mongodb-mongodb-core-require-optional-semver = "ISC"
LICENSE_${PN}-mongodb-mongodb-core-require-optional = "Apache-2.0"
LICENSE_${PN}-mongodb-mongodb-core = "Apache-2.0"
LICENSE_${PN}-mongodb-readable-stream-buffer-shims = "MIT"
LICENSE_${PN}-mongodb-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-mongodb-readable-stream-inherits = "ISC"
LICENSE_${PN}-mongodb-readable-stream-isarray = "MIT"
LICENSE_${PN}-mongodb-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-mongodb-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-mongodb-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-mongodb-readable-stream = "MIT"
LICENSE_${PN}-mongodb = "Apache-2.0"
LICENSE_${PN}-mpath = "MIT"
LICENSE_${PN}-mpromise = "MIT"
LICENSE_${PN}-mquery-bluebird = "MIT"
LICENSE_${PN}-mquery-debug-ms = "MIT"
LICENSE_${PN}-mquery-debug = "MIT"
LICENSE_${PN}-mquery-regexp-clone = "MIT"
LICENSE_${PN}-mquery-sliced = "MIT"
LICENSE_${PN}-mquery = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-muri = "MIT"
LICENSE_${PN}-regexp-clone = "MIT"
LICENSE_${PN}-sliced = "MIT"
LICENSE_${PN} = "MIT"
