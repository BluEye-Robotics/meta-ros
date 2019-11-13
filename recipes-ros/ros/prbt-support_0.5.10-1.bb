DESCRIPTION = "Mechanical, kinematic and visual description of the Pilz light weight arm PRBT."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp"

RDEPENDS_${PN} = "roscpp canopen-motor-node joint-state-controller robot-state-publisher topic-tools rosservice xacro controller-manager pilz-control prbt-hardware-support"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_support/0.5.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b7f21ac36c9222a66356ca88124cf7e"
SRC_URI[sha256sum] = "6ac4e419108bfd4ed78fbdad88b776efe98dddbe791760136984ad5ee04942f5"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_support-0.5.10-1"

inherit catkin
