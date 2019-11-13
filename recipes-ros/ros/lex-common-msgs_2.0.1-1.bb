DESCRIPTION = "Common messages for interacting with Amazon Lex using the lex_node package"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs audio-common-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/aws-gbp/lex_node-release/archive/release/melodic/lex_common_msgs/2.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1b62ec46f5b40bf97b35de6a7c46ab91"
SRC_URI[sha256sum] = "1379689a550b1cce87b3fb444add83140f2fcd085848da18b85dbc1f2ab772eb"

ROS_SPN = "lex_node"
S = "${WORKDIR}/lex_node-release-release-melodic-lex_common_msgs-2.0.1-1"

inherit catkin
