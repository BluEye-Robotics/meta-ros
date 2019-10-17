DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt!"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp moveit-core pluginlib libeigen moveit-ros-planning tf2 tf2-kdl orocos-kdl"

RDEPENDS_${PN} = "python-lxml"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_kinematics/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3923ba3407f7bc30d1600e64ae8bc5fb"
SRC_URI[sha256sum] = "985cac460cfb1e2a2c9d0c9715fd3f8fc03a5275ef0d7056cd79e5b6048cc3a3"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_kinematics-1.0.1-0"

inherit catkin
