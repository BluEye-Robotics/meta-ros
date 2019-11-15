DESCRIPTION = "AWS CloudWatch management library used to manage offline files."
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common dataflow-lite"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/file_management/1.1.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4bb8ffe3ed653b819aaa609701ce78b1"
SRC_URI[sha256sum] = "da43a316c11b0fd8f057e0a4019bdfd21d98de93dffb98fb940896532bb47379"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-file_management-1.1.2-1"

inherit catkin
