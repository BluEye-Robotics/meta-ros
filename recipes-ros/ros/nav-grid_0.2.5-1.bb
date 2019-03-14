DESCRIPTION = "A templatized interface for overlaying a two dimensional grid on the world."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_grid/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a2c591e988ce69cdb06db1d4753a3bfa"
SRC_URI[sha256sum] = "e545bfa545436be95ac4b293fbc3026d19714fde8b00ad3d9df8a508ca34d141"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_grid-0.2.5-1"

inherit catkin
