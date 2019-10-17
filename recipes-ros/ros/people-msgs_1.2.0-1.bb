DESCRIPTION = "Messages used by nodes in the people stack."
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people_msgs/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb483b4eeec8e6c02a4aa1cba8c333af"
SRC_URI[sha256sum] = "34ea58081f5b53566700ebf0728e024148a0b653f57b5a82560da05848f30f82"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-people_msgs-1.2.0-1"

inherit catkin
