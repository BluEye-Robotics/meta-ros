DESCRIPTION = "AWS CloudWatch management library used by ROS1/2 node to publish logs to CloudWatch service"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/melodic/cloudwatch_logs_common/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a600052ebbc4bacf3aefb1972e76ba0"
SRC_URI[sha256sum] = "8262c85a2dfaea8d1fb5e3126731f9101f3e87e59a8f959f4462c3cc04b6f3a7"

ROS_SPN = "cloudwatch_common"
S = "${WORKDIR}/cloudwatch_common-release-release-melodic-cloudwatch_logs_common-1.0.2-1"

inherit catkin
