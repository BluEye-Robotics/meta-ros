DESCRIPTION = "The ros_reflexxes package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "cmake-modules roscpp libreflexxestype2"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/KITrobotics/ipr_extern-release/archive/release/melodic/ros_reflexxes/0.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8fffb3fa73dbc65e4c7269b14a051d66"
SRC_URI[sha256sum] = "76626c036fcf97fd86efb214887ddffe715d343b660a6117eddd0f833ef11fda"

ROS_SPN = "ipr_extern"
S = "${WORKDIR}/ipr_extern-release-release-melodic-ros_reflexxes-0.8.8-1"

inherit catkin
