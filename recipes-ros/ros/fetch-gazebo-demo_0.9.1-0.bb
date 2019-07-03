DESCRIPTION = "Demos for fetch_gazebo package."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib fetch-gazebo fetch-moveit-config fetch-navigation moveit-commander moveit-python simple-grasping teleop-twist-keyboard"

RDEPENDS_${PN} = "actionlib fetch-gazebo fetch-moveit-config fetch-navigation moveit-commander moveit-python simple-grasping teleop-twist-keyboard"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo_demo/0.9.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca4a26cb9684e08be6222188dbcea0d3"
SRC_URI[sha256sum] = "07c57825c60fb935a99013eec3b272268a0b4d4564b9d68599dbdf7eff3e5389"

ROS_SPN = "fetch_gazebo"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_gazebo_demo-0.9.1-0"

inherit catkin
