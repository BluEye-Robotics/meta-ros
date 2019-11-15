DESCRIPTION = "AWS CloudWatch management library used by ROS1/2 node to publish logs to CloudWatch service"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common dataflow-lite file-management"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/cloudwatch_logs_common/1.1.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "26284fbb2868ea17ee83032512dca959"
SRC_URI[sha256sum] = "9f5c4824fa5f2c6fb4806a69d2f259ae73f93b74af62b3eac011a8903617c192"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-cloudwatch_logs_common-1.1.2-1"

inherit catkin
