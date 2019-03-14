DESCRIPTION = "A more performance- and stability-oriented server alternative implemented in C++ to rosserial_python."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosserial-msgs std-msgs roscpp topic-tools rosserial-msgs rosserial-python std-msgs roscpp topic-tools"

RDEPENDS_${PN} = "rosserial-msgs rosserial-python std-msgs roscpp topic-tools"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_server/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11f7ed39d370bb1f2a848bf43e0be6d9"
SRC_URI[sha256sum] = "fc7304dc2df2134f5d35a9e6ec22cf082a3742139f41b1ac1feb3156114a87b3"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_server-0.8.0-0"

inherit catkin
