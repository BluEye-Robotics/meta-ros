DESCRIPTION = "The um7 package provides a C++ implementation of the CH Robotics serial protocol, and a corresponding ROS node for publishing standard ROS orientation topics from a UM7."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation serial roscpp sensor-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-drivers-gbp/um7-release/archive/release/melodic/um7/0.0.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "037741eeb7ffb8d668743fd186121608"
SRC_URI[sha256sum] = "2def3dc297cb32a419cfed279aa05796da9a1129ea6d27a77ca28cc084ae5d39"

S = "${WORKDIR}/um7-release-release-melodic-um7-0.0.6-1"

inherit catkin
