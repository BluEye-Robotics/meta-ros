DESCRIPTION = "Messages and services package for OpenManipulator to send information about state or pose"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_msgs-release/archive/release/melodic/open_manipulator_msgs/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6eba0dfbedd0b312ab4655c0c0d5f1eb"
SRC_URI[sha256sum] = "8a499c54924fdc7b81c8315d5e720e3b2179757fc5ef98e524dfef53ac9bd300"

S = "${WORKDIR}/open_manipulator_msgs-release-release-melodic-open_manipulator_msgs-1.0.0-0"

inherit catkin
