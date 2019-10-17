DESCRIPTION = "Library used by ROS1/2 node to publish metrics"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common dataflow-lite file-management"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/cloudwatch_metrics_common/1.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "da29f83091e38e002698fdd69fa6e8d8"
SRC_URI[sha256sum] = "6d863bb18e1f995e5e4e2b80aff9fe00be3e0dc48724b8e89165fae56d32b169"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-cloudwatch_metrics_common-1.1.0-1"

inherit catkin
