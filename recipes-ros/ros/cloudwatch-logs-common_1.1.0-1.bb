DESCRIPTION = "AWS CloudWatch management library used by ROS1/2 node to publish logs to CloudWatch service"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common dataflow-lite file-management"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/cloudwatch_logs_common/1.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a93d9befe0616a1ac23870df3ebc56b9"
SRC_URI[sha256sum] = "1901327f87e630ea72137860d5dd79b9f1ca0770748aa4915cb8230c34d92f70"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-cloudwatch_logs_common-1.1.0-1"

inherit catkin
