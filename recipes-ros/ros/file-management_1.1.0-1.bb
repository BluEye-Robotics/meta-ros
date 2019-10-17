DESCRIPTION = "AWS CloudWatch management library used to manage offline files."
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common dataflow-lite"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/file_management/1.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4912bc3506e7a106907faea4564d6977"
SRC_URI[sha256sum] = "54c6fde6a25317d13e8354d3e62658771cfe7e51cf9e151f8a127f171bd3447e"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-file_management-1.1.0-1"

inherit catkin
