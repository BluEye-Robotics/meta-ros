DESCRIPTION = "ROS messages for Geographic Information Systems."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs uuid-msgs message-runtime geometry-msgs std-msgs uuid-msgs"

RDEPENDS_${PN} = "message-runtime geometry-msgs std-msgs uuid-msgs"

SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/melodic/geographic_msgs/0.5.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1111931e3c0a17a179d50cc1b044e32d"
SRC_URI[sha256sum] = "68d46a359b8eec02f2ee60c6997f9bf3399925e9f93c453839a07125ce8f959f"

ROS_SPN = "geographic_info"
S = "${WORKDIR}/geographic_info-release-release-melodic-geographic_msgs-0.5.3-0"

inherit catkin
