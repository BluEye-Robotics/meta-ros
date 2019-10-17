DESCRIPTION = "Python interfaces to MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python"

RDEPENDS_${PN} = "geometry-msgs moveit-msgs moveit-ros-planning-interface python python-pyassimp rospy sensor-msgs shape-msgs tf"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_commander/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "edffddcadb0514fe49d21d63378e56c7"
SRC_URI[sha256sum] = "ea3303f2603691866e92db0d35a0491c179d9c68bbabe6b6c251928bd8614e53"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_commander-1.0.1-0"

inherit catkin
