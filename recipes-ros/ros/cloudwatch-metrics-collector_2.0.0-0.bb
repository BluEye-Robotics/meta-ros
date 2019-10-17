DESCRIPTION = "Subscriber node for the aws/monitoring topic to publish metrics to AWS Cloudwatch"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "ros-monitoring-msgs cloudwatch-metrics-common roscpp aws-common aws-ros1-common roscpp cloudwatch-metrics-common ros-monitoring-msgs aws-ros1-common"

RDEPENDS_${PN} = "aws-ros1-common ros-monitoring-msgs cloudwatch-metrics-common roscpp"

SRC_URI = "https://github.com/aws-gbp/cloudwatch_metrics_collector-release/archive/release/melodic/cloudwatch_metrics_collector/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1277fe9377d5bbd9f591049917635d0e"
SRC_URI[sha256sum] = "85f807efb7f6dfc6cca35eed12ee12e4bc864e618221903eddab3c28920721cf"

S = "${WORKDIR}/cloudwatch_metrics_collector-release-release-melodic-cloudwatch_metrics_collector-2.0.0-0"

inherit catkin
