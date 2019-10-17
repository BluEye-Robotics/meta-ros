DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core moveit-ros-planning pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_fake_controller_manager/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f04610af80897bf9e90825833f928ff2"
SRC_URI[sha256sum] = "81da969af27c558f406c4349b97cc26710f55df559cf16b4123cea90d6c17f03"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_fake_controller_manager-1.0.2-1"

inherit catkin
