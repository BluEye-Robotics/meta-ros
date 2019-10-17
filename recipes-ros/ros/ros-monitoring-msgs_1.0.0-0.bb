DESCRIPTION = "Messages for publishing monitoring data about ROS systems"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/aws-gbp/ros_monitoring_msgs-release/archive/release/melodic/ros_monitoring_msgs/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "af947bf5c181bd6620e0cc5a5daf6418"
SRC_URI[sha256sum] = "3f7de8101df1c96e947d8123e8eef5a129edc09a1e5ce723e9d91409c9cba565"

S = "${WORKDIR}/ros_monitoring_msgs-release-release-melodic-ros_monitoring_msgs-1.0.0-0"

inherit catkin
