DESCRIPTION = "Messages for calibrating a robot"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "actionlib-msgs geometry-msgs message-generation sensor-msgs std-msgs actionlib-msgs geometry-msgs message-runtime sensor-msgs std-msgs"

RDEPENDS_${PN} = "actionlib-msgs geometry-msgs message-runtime sensor-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/robot_calibration-release/archive/release/melodic/robot_calibration_msgs/0.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f0184460021b115d55df332c2694aa2e"
SRC_URI[sha256sum] = "ea0ffb952c39266c63a6a96dea7b3763b0c36c4b28363c08d41171ed1a021097"

ROS_SPN = "robot_calibration"
S = "${WORKDIR}/robot_calibration-release-release-melodic-robot_calibration_msgs-0.6.0-0"

inherit catkin
