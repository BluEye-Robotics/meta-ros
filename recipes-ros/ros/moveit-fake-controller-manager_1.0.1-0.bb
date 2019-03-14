DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core moveit-ros-planning pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_fake_controller_manager/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fd9d5606e4ac5b8195365fd23759707"
SRC_URI[sha256sum] = "feaa120207501e6224b2ce7340cadecc2bd54533ab516ffea3423d635a58a612"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_fake_controller_manager-1.0.1-0"

inherit catkin
