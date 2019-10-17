DESCRIPTION = "The um7 package provides a C++ implementation of the CH Robotics serial protocol, and a corresponding ROS node for publishing standard ROS orientation topics from a UM7."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation serial roscpp sensor-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-drivers-gbp/um7-release/archive/release/melodic/um7/0.0.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7829e6c6e86f1d9f537823b5f0386c37"
SRC_URI[sha256sum] = "d557326e26d705cb29897eb7ac32baa349a08c71d07cf9501e6c457e3d634349"

S = "${WORKDIR}/um7-release-release-melodic-um7-0.0.4-0"

inherit catkin
