DESCRIPTION = "The health_metric_collector package"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp rospy std-msgs message-generation ros-monitoring-msgs aws-common aws-ros1-common"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/aws-gbp/health_metric_collector-release/archive/release/melodic/health_metric_collector/2.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f38efcc89d998d32fa64ef4232f2691"
SRC_URI[sha256sum] = "f5e60876143b1062f020f54087a4513795c1f1b5b1c8facc4b466a95ac25a7a9"

S = "${WORKDIR}/health_metric_collector-release-release-melodic-health_metric_collector-2.0.1-1"

inherit catkin
