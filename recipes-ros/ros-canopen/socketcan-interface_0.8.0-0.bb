DESCRIPTION = "This package contains a generic CAN interface description with helpers for filtering and driver implementation. Further a socketcan implementation based on boost::asio is included."
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"
SRC_URI[md5sum] = "d9b066a4e3bcabe34c74036f26cd0ca1"
SRC_URI[sha256sum] = "46aa16fc7db59c4b0353cba915f7ccadeff9eb1b4b1d521d166d51a10b6d53a5"

DEPENDS = "boost class-loader virtual/kernel"

require ros-canopen.inc

# libclass_loader.so: error: undefined reference to 'pthread_mutexattr_destroy', 'pthread_mutexattr_settype', 'pthread_mutexattr_init'
LDFLAGS_append = "${@bb.utils.contains('DISTRO_FEATURES', 'ld-is-gold', ' -fuse-ld=bfd ', '', d)}"
