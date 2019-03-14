DESCRIPTION = "A pure-python interaface to the MoveIt! ROS API."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib geometry-msgs moveit-msgs python-pyassimp rospy shape-msgs tf"

RDEPENDS_${PN} = "actionlib geometry-msgs moveit-msgs python-pyassimp rospy shape-msgs tf"

SRC_URI = "https://github.com/mikeferguson/moveit_python-release/archive/release/melodic/moveit_python/0.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49737e3e0977b56f12d717bbfe6c0ab3"
SRC_URI[sha256sum] = "17781480fab3a6e6b44d90315cb6c257cceb228d58d8db2b0892895dc3d4b533"

S = "${WORKDIR}/moveit_python-release-release-melodic-moveit_python-0.3.1-0"

inherit catkin
