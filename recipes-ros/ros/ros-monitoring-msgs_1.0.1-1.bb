DESCRIPTION = "Messages for publishing monitoring data about ROS systems"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/aws-gbp/ros_monitoring_msgs-release/archive/release/melodic/ros_monitoring_msgs/1.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d78ab702821587c72336cfffb7b5f2de"
SRC_URI[sha256sum] = "d9215590fe7e1d5c0dadd7a19195db12250e64327bd5423ad6292c0a7e920165"

S = "${WORKDIR}/ros_monitoring_msgs-release-release-melodic-ros_monitoring_msgs-1.0.1-1"

inherit catkin
