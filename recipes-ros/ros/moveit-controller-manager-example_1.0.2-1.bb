DESCRIPTION = "An example controller manager plugin for MoveIt. This is not functional code."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_controller_manager_example/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f2754a8eab8b4f7cb487cd475ce4d97a"
SRC_URI[sha256sum] = "3ac00ba25d7359af9dd91ff581b2189e04a1a4328913389f1c2f100379782a1f"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_controller_manager_example-1.0.2-1"

inherit catkin
