DESCRIPTION = "Light version of dataflow libraries"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/dataflow_lite/1.1.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72f73c64ed93303cde10acdae5156caf"
SRC_URI[sha256sum] = "9d672144635cb6d0ec0bb039f13f5b779c6faae225a2834f8388802e39170855"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-dataflow_lite-1.1.2-1"

inherit catkin
