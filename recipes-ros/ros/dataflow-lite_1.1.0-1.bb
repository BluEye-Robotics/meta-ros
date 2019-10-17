DESCRIPTION = "Light version of dataflow libraries"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/dataflow_lite/1.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "92e7b29d125861a27c484ae2620e044c"
SRC_URI[sha256sum] = "db8584ba8c3ad6e409b866429a766cce5a3669849e8243e2edbf451913c7f55f"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-dataflow_lite-1.1.0-1"

inherit catkin
