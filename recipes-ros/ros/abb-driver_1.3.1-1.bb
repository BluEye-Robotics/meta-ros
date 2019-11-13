DESCRIPTION = ""
AUTHOR = "Edward Venator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "industrial-robot-client"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_driver/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "435bbb125abef2621b8d7ba94d9ecfd8"
SRC_URI[sha256sum] = "268b1f5209eabcce2975ccf482c6673fccaea7fb25f491927a4001bc1263e75f"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_driver-1.3.1-1"

inherit catkin
