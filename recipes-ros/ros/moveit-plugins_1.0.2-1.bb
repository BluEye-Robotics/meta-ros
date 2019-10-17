DESCRIPTION = "Metapackage for MoveIt! plugins."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-simple-controller-manager moveit-fake-controller-manager moveit-ros-control-interface"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_plugins/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2a49822a3dec5a92ae574b06d115f0f2"
SRC_URI[sha256sum] = "50d9d908c1d2fa7fe7f064d766471adb9daf453293026ca33ad7c6d87129aed6"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_plugins-1.0.2-1"

inherit catkin
