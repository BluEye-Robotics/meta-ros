DESCRIPTION = "MAVLink message marshaling library. This package provides C-headers and C++11 library for both 1. 0 and 2. 0 versions of protocol. For pymavlink use separate install via rosdep (python-pymavlink)."
AUTHOR = "Lorenz Meier"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "python3-setuptools python3-lxml python3-future python"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/melodic/mavlink/2019.9.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "78f6944fd4c9c5f919164d36d9c33cef"
SRC_URI[sha256sum] = "ee07bda8eaa78c3587a0575b9ac48bdb7e55678c65ccd0cb347f32012ae21c93"

S = "${WORKDIR}/mavlink-gbp-release-release-melodic-mavlink-2019.9.9-1"

inherit catkin
