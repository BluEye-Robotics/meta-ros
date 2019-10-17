DESCRIPTION = "Python interfaces to MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python"

RDEPENDS_${PN} = "geometry-msgs moveit-msgs moveit-ros-planning-interface python python3-pyassimp rospy sensor-msgs shape-msgs tf"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_commander/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c818cae9dadc2da5d442fec0989ca296"
SRC_URI[sha256sum] = "83683a1960eb99613aab9bcd543e43b2df9ea2b5b4e231dad6e1a1aa4e7c6314"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_commander-1.0.2-1"

inherit catkin
