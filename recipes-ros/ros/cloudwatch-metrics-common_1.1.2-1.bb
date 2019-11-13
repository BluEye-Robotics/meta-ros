DESCRIPTION = "Library used by ROS1/2 node to publish metrics"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common dataflow-lite file-management"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/cloudwatch_metrics_common/1.1.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2543b36076b770d15504974de23192ce"
SRC_URI[sha256sum] = "5443a3551b566a6a1fbb36a3ea78f287c0500e19de1628914cd94e443bb0b0eb"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-cloudwatch_metrics_common-1.1.2-1"

inherit catkin
