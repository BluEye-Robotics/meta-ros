DESCRIPTION = "Package providing a ROS node for interacting with Amazon Lex"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs lex-common-msgs aws-common aws-ros1-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/lex_node-release/archive/release/melodic/lex_node/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "76826d74683ac3ca4a815fdb2fec91be"
SRC_URI[sha256sum] = "f1d299c1196758e3443d3d83d2e5953391c35b8b00c233b36257a3ad38d03ee7"

S = "${WORKDIR}/lex_node-release-release-melodic-lex_node-2.0.0-0"

inherit catkin
