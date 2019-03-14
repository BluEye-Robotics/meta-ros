DESCRIPTION = "JSON ROS message"
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=37;endline=37;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/locusrobotics/json_transport-release/archive/release/melodic/json_msgs/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6f320c7eafb0724acd4d6ef9701e2ced"
SRC_URI[sha256sum] = "bf40e01a92a86cd7c5f7c56e26b160dd8425c7bdcaee3d407ceac8f6dfc115f8"

ROS_SPN = "json_transport"
S = "${WORKDIR}/json_transport-release-release-melodic-json_msgs-0.0.3-0"

inherit catkin
