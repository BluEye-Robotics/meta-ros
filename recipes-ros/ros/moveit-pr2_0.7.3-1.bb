DESCRIPTION = "All PR2-specific packages for MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "pr2-moveit-config pr2-moveit-plugins"

SRC_URI = "https://github.com/ros-gbp/moveit_pr2-release/archive/release/melodic/moveit_pr2/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0ba2a12ce4fdcde0299f4a14160458ce"
SRC_URI[sha256sum] = "8a3751258daacbd61d9aeb30c604461c0b75b192e98186621eb6cbae8c9b49ad"

S = "${WORKDIR}/moveit_pr2-release-release-melodic-moveit_pr2-0.7.3-1"

inherit catkin
