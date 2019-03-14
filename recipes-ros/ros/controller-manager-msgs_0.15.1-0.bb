DESCRIPTION = "Messages and services for the controller manager."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/controller_manager_msgs/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "277c9309f51d7c513ccf5a206fb20f0b"
SRC_URI[sha256sum] = "4f4fcbac638d2fd81b823c7db44c3d0b7dfd41c961cc7360b301f16849ad6b79"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-controller_manager_msgs-0.15.1-0"

inherit catkin
