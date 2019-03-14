DESCRIPTION = "Implementation of dlux_global_planner plugin interfaces."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dlux-global-planner nav-core2 nav-grid pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/dlux_plugins/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "edc1bfb4fbc2be2306c4b7c37277d34b"
SRC_URI[sha256sum] = "c76766fca13a89b2f6e6222c47f57f44765c44268c7b4439db3bc5869c23a296"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-dlux_plugins-0.2.5-1"

inherit catkin
