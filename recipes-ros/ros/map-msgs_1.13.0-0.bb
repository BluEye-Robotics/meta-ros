DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "Stéphane Magnenat"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "message-generation std-msgs sensor-msgs nav-msgs message-runtime std-msgs sensor-msgs nav-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs sensor-msgs nav-msgs"

SRC_URI = "https://github.com/ros-gbp/navigation_msgs-release/archive/release/melodic/map_msgs/1.13.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "56b1959d46a31fa91bfdb378ce149dbd"
SRC_URI[sha256sum] = "a0b7044c2fd59448eb714ce14d60c5ff2d0073962e011e6549c7dd99fc916ffc"

ROS_SPN = "navigation_msgs"
S = "${WORKDIR}/navigation_msgs-release-release-melodic-map_msgs-1.13.0-0"

inherit catkin
