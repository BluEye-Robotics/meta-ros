DESCRIPTION = "Package providing a ROS node for interacting with Amazon Lex"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs lex-common-msgs aws-common aws-ros1-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/lex_node-release/archive/release/melodic/lex_node/2.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aa46dc327317bba36745389d2c6a5b4e"
SRC_URI[sha256sum] = "117cf4ce5de564b0b5bded63277f07ee0a9da28df13fb8750181640ccd1a358e"

S = "${WORKDIR}/lex_node-release-release-melodic-lex_node-2.0.1-1"

inherit catkin
