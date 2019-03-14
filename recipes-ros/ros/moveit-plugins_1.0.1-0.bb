DESCRIPTION = "Metapackage for MoveIt! plugins."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-simple-controller-manager moveit-fake-controller-manager moveit-ros-control-interface"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_plugins/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3dd7144dcd864f1f45f42e231cd02a03"
SRC_URI[sha256sum] = "9d5026b7d7a2b55bb3e5d959d8722eb75fa260fd5a6689e33e2f550fec3c8b99"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_plugins-1.0.1-0"

inherit catkin
