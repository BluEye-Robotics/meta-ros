DESCRIPTION = "MAVLink message marshaling library. This package provides C-headers and C++11 library for both 1. 0 and 2. 0 versions of protocol. For pymavlink use separate install via rosdep (python-pymavlink)."
AUTHOR = "Lorenz Meier"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "python3-setuptools python3-lxml python3-future python"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/melodic/mavlink/2019.11.11-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d5e0a17b1bf0b00875dab52b19418333"
SRC_URI[sha256sum] = "3dfeb366675dfdf90af26e764e82a8c22922ac06b6adf7890f380454db5aca8a"

S = "${WORKDIR}/mavlink-gbp-release-release-melodic-mavlink-2019.11.11-1"

inherit catkin
