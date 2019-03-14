DESCRIPTION = "The actionlib_tutorials package"
AUTHOR = "Melonee Wise"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib message-generation std-msgs actionlib-msgs roscpp actionlib message-runtime"

RDEPENDS_${PN} = "roscpp actionlib message-runtime"

SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/actionlib_tutorials/0.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8dfebaaa39515873ea0abab78178897d"
SRC_URI[sha256sum] = "202b1bd5a2d7cde96dcd20fa54fb6fc017ec6e1252575b5413618310c536163e"

ROS_SPN = "common_tutorials"
S = "${WORKDIR}/common_tutorials-release-release-melodic-actionlib_tutorials-0.1.11-0"

inherit catkin
