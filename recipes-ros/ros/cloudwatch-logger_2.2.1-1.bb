DESCRIPTION = "CloudWatch Logger node for publishing logs to AWS CloudWatch Logs"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cloudwatch-logs-common aws-common aws-ros1-common roscpp std-srvs std-msgs cloudwatch-logs-common aws-common aws-ros1-common roscpp std-srvs std-msgs"

RDEPENDS_${PN} = "cloudwatch-logs-common aws-common aws-ros1-common roscpp std-srvs std-msgs"

SRC_URI = "https://github.com/aws-gbp/cloudwatch_logger-release/archive/release/melodic/cloudwatch_logger/2.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61f376e3277e99a725014181ea646d55"
SRC_URI[sha256sum] = "03cca488a1f918e13adf56eda946a89c3858f949cac82f14ccc1cbeb9c3bce81"

S = "${WORKDIR}/cloudwatch_logger-release-release-melodic-cloudwatch_logger-2.2.1-1"

inherit catkin
