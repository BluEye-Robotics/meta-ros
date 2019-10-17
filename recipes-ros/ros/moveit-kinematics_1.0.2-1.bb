DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt!"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp moveit-core pluginlib libeigen tf2 tf2-kdl orocos-kdl"

RDEPENDS_${PN} = "python-lxml liburdfdom-tools"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_kinematics/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "770c1b5c0336ed14dde8973911ebd482"
SRC_URI[sha256sum] = "5b691b09f0e6b7560ab0971ee94fb84a351142b5619dab071b3c1924a6766c13"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_kinematics-1.0.2-1"

inherit catkin
