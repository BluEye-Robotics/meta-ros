DESCRIPTION = "Common messages for interacting with Amazon Lex using the lex_node package"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs audio-common-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/aws-gbp/lex_node-release/archive/release/melodic/lex_common_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8a8fa3e20cf98eb4a6c37d0cd52cb595"
SRC_URI[sha256sum] = "38bc675f3d1607953a04c92775548a0cda08aa90b0699ed3c8ae3cd0d5d3c98d"

ROS_SPN = "lex_node"
S = "${WORKDIR}/lex_node-release-release-melodic-lex_common_msgs-2.0.0-0"

inherit catkin
