DESCRIPTION = "Packagegroup para o equalizer CM Comandos Lineares"
LICENSE = "MIT"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

CONNMAN_PACKAGES="\
    connman \
    connman-client \
    connman-tests \
    connman-tools \
"

UTIL_PACKAGES="\
    curl \
    less \
    avahi-daemon \
    tcpdump \
    screen \
    bridge-utils \
    lsof \
    rsync \
    socat \
    links \
    iw \
    mosh \
    macchanger \
    netcat-openbsd \
    tzdata \
    bind-utils \
    usbutils \
    ethtool \
    trace-cmd \
    packagegroup-core-buildessential \
    openssl-dev \
    git \
    python-scons \
    boost-dev \
    python-pip \
"

EQUALIZER_PACKAGES="\
    nginx \
    sqlite3 \
    nodejs \
    nodejs-npm \
    express \
    body-parser \
    cookie-parser \
    debug \
    ejs \
    connect-redis \
    morgan \
    express-handlebars \
    express-session \
    passport \
    passport-local \
    bcrypt-nodejs \
    serve-favicon \
    connect-flash \
    dateformat \
    equalizer-api \
    gnuplot \
    sqlite3-node \
    ip \
    getmac \
    network \
"

RDEPENDS_packagegroup-cm-equalizer = "\
    ${CONNMAN_PACKAGES} \
    ${UTIL_PACKAGES} \
    ${EQUALIZER_PACKAGES} \
"

RRECOMMENDS_${PN} = "\
    ${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS} \
"

