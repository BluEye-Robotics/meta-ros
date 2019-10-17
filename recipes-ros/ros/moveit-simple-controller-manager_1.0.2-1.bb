DESCRIPTION = "A generic, simple controller manager plugin for MoveIt."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core roscpp pluginlib control-msgs actionlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_simple_controller_manager/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "45ffab19ce13f70df8dff5b8cdbf1dd0"
SRC_URI[sha256sum] = "2d9df58ece4beca42b4d6b27da0c2f308c866f5ea5842a63eaa2bbe7258499ee"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_simple_controller_manager-1.0.2-1"

inherit catkin
