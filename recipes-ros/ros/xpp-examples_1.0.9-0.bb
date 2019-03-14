DESCRIPTION = "Examples of how to use the xpp framework."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rosbag xpp-vis xpp-hyq xpp-quadrotor"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_examples/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c4d89db08a0276894ac8c67996f90a05"
SRC_URI[sha256sum] = "edbd141c0639995abb62e5eaa2dd0f0b6885158dc3125e6e3eeec3ce47e3027a"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_examples-1.0.9-0"

inherit catkin
