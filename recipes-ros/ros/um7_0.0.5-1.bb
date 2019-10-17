DESCRIPTION = "The um7 package provides a C++ implementation of the CH Robotics serial protocol, and a corresponding ROS node for publishing standard ROS orientation topics from a UM7."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation serial roscpp sensor-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-drivers-gbp/um7-release/archive/release/melodic/um7/0.0.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "35fffa5b0a7d7a14bed5571fc0b14b06"
SRC_URI[sha256sum] = "99aa305ce950e41636e536f309f0387369236f0b2fabb128c6d875f575623421"

S = "${WORKDIR}/um7-release-release-melodic-um7-0.0.5-1"

inherit catkin
