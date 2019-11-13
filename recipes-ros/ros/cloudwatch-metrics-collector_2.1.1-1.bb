DESCRIPTION = "Subscriber node for the aws/monitoring topic to publish metrics to AWS Cloudwatch"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "ros-monitoring-msgs cloudwatch-metrics-common roscpp aws-common aws-ros1-common std-srvs std-msgs cloudwatch-metrics-common aws-common aws-ros1-common roscpp std-srvs std-msgs ros-monitoring-msgs"

RDEPENDS_${PN} = "cloudwatch-metrics-common aws-common aws-ros1-common roscpp std-srvs std-msgs ros-monitoring-msgs"

SRC_URI = "https://github.com/aws-gbp/cloudwatch_metrics_collector-release/archive/release/melodic/cloudwatch_metrics_collector/2.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ce7d894ff7c28356ca417b2e204b48c3"
SRC_URI[sha256sum] = "765bfbb06471515deaa6dc40b39f426ef386774cf658a7b9afe356cfa75e2ca2"

S = "${WORKDIR}/cloudwatch_metrics_collector-release-release-melodic-cloudwatch_metrics_collector-2.1.1-1"

inherit catkin
