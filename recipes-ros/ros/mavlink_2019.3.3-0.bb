DESCRIPTION = "MAVLink message marshaling library. This package provides C-headers and C++11 library for both 1. 0 and 2. 0 versions of protocol. For pymavlink use separate install via rosdep (python-pymavlink)."
AUTHOR = "Lorenz Meier"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "python-setuptools python-lxml python-future python"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/melodic/mavlink/2019.3.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dd00af2b9d7fcdbae6f7aac665590a40"
SRC_URI[sha256sum] = "218538d88fe77bf8f4ba6e66193f58807da86259d1045c1672d98d48ac5ee0fb"

S = "${WORKDIR}/mavlink-gbp-release-release-melodic-mavlink-2019.3.3-0"

inherit catkin
