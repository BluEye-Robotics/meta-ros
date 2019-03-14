DESCRIPTION = "tf2_msgs"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs geometry-msgs message-generation actionlib-msgs geometry-msgs message-generation"

RDEPENDS_${PN} = "actionlib-msgs geometry-msgs message-generation"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_msgs/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb62c8fe94215dacb6eff7b2fcbcf72f"
SRC_URI[sha256sum] = "27ecf00eef462615bab0dd0ff5232f6aaad8712e79bbf5912c008705f27c1d5d"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_msgs-0.6.5-0"

inherit catkin
