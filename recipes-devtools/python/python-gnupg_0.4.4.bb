SUMMARY = "A wrapper for the Gnu Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "A wrapper for the Gnu Privacy Guard (GPG or GnuPG)"
LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b0b7ac63b60085b23fa9f7e1951daa1d"

SRC_URI[md5sum] = "c5d54f5a1bafc412f9b5a03ee06cb82e"
SRC_URI[sha256sum] = "45daf020b370bda13a1429c859fcdff0b766c0576844211446f9266cae97fb0e"

PYPI_PACKAGE = "python-gnupg"

RDEPENDS_${PN} += "gnupg"


inherit pypi setuptools
