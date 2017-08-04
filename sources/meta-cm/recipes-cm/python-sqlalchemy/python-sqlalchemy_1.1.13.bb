DESCRIPTION = "Python SQL toolkit and Object Relational Mapper that gives \
application developers the full power and flexibility of SQL"
HOMEPAGE = "http://www.sqlalchemy.org/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=452f4b8adb0feba42e5be5f1fbfbf538"
RDEPENDS_${PN} += "python-numbers"

SRCNAME = "SQLAlchemy"
SRC_URI="https://pypi.python.org/packages/a2/43/e90732a93d512c1c8b27f38990a8531b208c34fae0de661ef81668131095/SQLAlchemy-1.1.13.tar.gz"
SRC_URI[md5sum] = "6353eb8223b8476bb0399c28adff5850"
SRC_URI[sha256sum] = "2a98ac87b30eaa2bee1f1044848b9590e476e7f93d033c6542e60b993a5cf898"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

