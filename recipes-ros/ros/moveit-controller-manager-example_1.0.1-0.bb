DESCRIPTION = "An example controller manager plugin for MoveIt. This is not functional code."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_controller_manager_example/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "736a4242c7e649f4ede41f0fc301cc5b"
SRC_URI[sha256sum] = "7594ace173bf4c1d41806d16686f371784e37f2169aa655548213b4b44f849a1"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_controller_manager_example-1.0.1-0"

inherit catkin
