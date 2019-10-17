DESCRIPTION = "Internal packaging of the 0. 91 version of the simple python"
AUTHOR = "LParis"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "python3-catkin-pkg"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_ebnf/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6e7f9be7d1be4ef3a423f10e31bc7f48"
SRC_URI[sha256sum] = "90319996d97b66a6313bc7ac6a4c9377ca608582bce668f3040d671e8c49bad6"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_ebnf-0.3.2-0"

inherit catkin
