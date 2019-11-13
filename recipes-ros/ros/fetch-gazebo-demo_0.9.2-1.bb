DESCRIPTION = "Demos for fetch_gazebo package."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib fetch-gazebo fetch-moveit-config fetch-navigation moveit-commander moveit-python simple-grasping teleop-twist-keyboard"

RDEPENDS_${PN} = "actionlib fetch-gazebo fetch-moveit-config fetch-navigation moveit-commander moveit-python simple-grasping teleop-twist-keyboard"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo_demo/0.9.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1849f3d0d6366145f81798e6a69e60c2"
SRC_URI[sha256sum] = "05bdd08b42eef924bb22fe4761ce314019a5192c9c4905c65cecb83aa42de1e3"

ROS_SPN = "fetch_gazebo"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_gazebo_demo-0.9.2-1"

inherit catkin
