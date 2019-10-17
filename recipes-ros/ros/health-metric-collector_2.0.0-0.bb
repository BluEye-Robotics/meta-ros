DESCRIPTION = "The health_metric_collector package"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp rospy std-msgs message-generation ros-monitoring-msgs aws-common aws-ros1-common"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/aws-gbp/health_metric_collector-release/archive/release/melodic/health_metric_collector/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e824897580f25fdeee58791a6662e465"
SRC_URI[sha256sum] = "a0b78f0e8e9edbbea16f0837f64764358c03dad0b2e2bd07012c802697b20d78"

S = "${WORKDIR}/health_metric_collector-release-release-melodic-health_metric_collector-2.0.0-0"

inherit catkin
