DESCRIPTION = "Packagegroup para o equalizer CM Comandos Lineares"
LICENSE = "MIT"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SNMP_PACKAGES="\
    net-snmp-server \
    net-snmp-libs \
    net-snmp-mibs \
"

UTIL_PACKAGES="\
    nano \
    i2c-tools \ 
    minicom \
    lrzsz \
    curl \
    tcpdump \
    screen \
    lsof \
    rsync \
    socat \
    netcat-openbsd \
    tzdata \
    bind-utils \
    usbutils \
    ethtool \
    trace-cmd \
    python-scons \
    boost-dev \
    python-pip \
"

EQUALIZER_PACKAGES="\
    git \
    packagegroup-core-buildessential \
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
    express \
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
    resolvconf \
    nodemailer \
    ntp-client \
    setup \
    sntp-node \
    equalizer-serial-service \
    snmp-passpersist \
    pysnmp \
    pyasn1 \
    equalizer-agent \
    python-sqlalchemy \
"

NETWORK_PACKAGES = "\
    networkmanager \
    modemmanager \
    uuid \
    usb-modeswitch \
    net-tools \
    mobile-broadband-provider-info \
    dhcp-server \
    wpa-supplicant \
    wireless-tools \
"

RDEPENDS_packagegroup-equalizer = "\
    ${UTIL_PACKAGES} \
    ${NETWORK_PACKAGES} \
    ${SNMP_PACKAGES} \
    ${EQUALIZER_PACKAGES} \
"

RRECOMMENDS_${PN} = "\
    ${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS} \
"

