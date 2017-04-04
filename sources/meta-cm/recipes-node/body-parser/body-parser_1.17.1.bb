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
LICENSE = "ISC & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/depd/LICENSE;md5=89378960d0c54c30539e50c7a78ce846 \
                    file://node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/http-errors/node_modules/depd/LICENSE;md5=89378960d0c54c30539e50c7a78ce846 \
                    file://node_modules/http-errors/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/http-errors/node_modules/statuses/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/http-errors/node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/content-type/LICENSE;md5=f4b767f006864f81a4901347fe4efdab \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/raw-body/LICENSE;md5=c970d30155ebbdb1903e6de8c0666e18 \
                    file://node_modules/raw-body/node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/raw-body/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/raw-body/node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/on-finished/node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/type-is/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/type-is/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/type-is/node_modules/media-typer/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20"

SRC_URI = "npm://registry.npmjs.org;name=body-parser;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Node.js body parsing middleware"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-bytes = "MIT"
LICENSE_${PN}-content-type = "MIT"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-depd = "MIT"
LICENSE_${PN}-http-errors-depd = "MIT"
LICENSE_${PN}-http-errors-inherits = "ISC"
LICENSE_${PN}-http-errors-setprototypeof = "ISC"
LICENSE_${PN}-http-errors-statuses = "MIT"
LICENSE_${PN}-http-errors = "MIT"
LICENSE_${PN}-iconv-lite = "MIT"
LICENSE_${PN}-on-finished-ee-first = "MIT"
LICENSE_${PN}-on-finished = "MIT"
LICENSE_${PN}-qs = "BSD-3-Clause"
LICENSE_${PN}-raw-body-bytes = "MIT"
LICENSE_${PN}-raw-body-iconv-lite = "MIT"
LICENSE_${PN}-raw-body-unpipe = "MIT"
LICENSE_${PN}-raw-body = "MIT"
LICENSE_${PN}-type-is-media-typer = "MIT"
LICENSE_${PN}-type-is-mime-types-mime-db = "MIT"
LICENSE_${PN}-type-is-mime-types = "MIT"
LICENSE_${PN}-type-is = "MIT"
LICENSE_${PN} = "MIT"
