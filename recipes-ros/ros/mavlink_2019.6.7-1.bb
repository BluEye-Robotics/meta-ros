DESCRIPTION = "MAVLink message marshaling library. This package provides C-headers and C++11 library for both 1. 0 and 2. 0 versions of protocol. For pymavlink use separate install via rosdep (python-pymavlink)."
AUTHOR = "Lorenz Meier"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "python-setuptools python-lxml python-future python"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/melodic/mavlink/2019.6.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0253f34574eb29abcb76468d017a3eff"
SRC_URI[sha256sum] = "8f0380037825a0889b5b414b31cf11de09f4b1fb9c9705fadb7174e53735d5cd"

S = "${WORKDIR}/mavlink-gbp-release-release-melodic-mavlink-2019.6.7-1"

inherit catkin
