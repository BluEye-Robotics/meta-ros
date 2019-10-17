DESCRIPTION = "CloudWatch Logger node for publishing logs to AWS CloudWatch Logs"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cloudwatch-logs-common aws-common aws-ros1-common roscpp cloudwatch-logs-common aws-common aws-ros1-common roscpp"

RDEPENDS_${PN} = "cloudwatch-logs-common aws-common aws-ros1-common roscpp"

SRC_URI = "https://github.com/aws-gbp/cloudwatch_logger-release/archive/release/melodic/cloudwatch_logger/2.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "269303ba33597041e3f85919685d143a"
SRC_URI[sha256sum] = "959398f364fb17914a2236732b98425db13aee0dfaee503a39741c9b4daead33"

S = "${WORKDIR}/cloudwatch_logger-release-release-melodic-cloudwatch_logger-2.1.0-1"

inherit catkin
