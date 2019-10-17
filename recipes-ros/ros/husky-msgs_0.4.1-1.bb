DESCRIPTION = "Messages for Clearpath Husky"
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_msgs/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6a22259664458a0230c7b766ef45626c"
SRC_URI[sha256sum] = "db4b3f8cd81bebcafb363152242495c2fc9438a37141323d40238ed8a28ccc8e"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_msgs-0.4.1-1"

inherit catkin
