DESCRIPTION = "Module for working with rocon uri strings."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rocon-console rocon-ebnf rocon-python-utils python-rospkg rospy"

RDEPENDS_${PN} = "rocon-console rocon-ebnf rocon-python-utils python-rospkg rospy"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_uri/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4a99671dcaabeaf8e7b39615385773c3"
SRC_URI[sha256sum] = "bdaecc320ad45d56c33e3b5d3ad2448ac7e3952dca5c8e3fd34d3adee125c69c"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_uri-0.3.2-0"

inherit catkin
