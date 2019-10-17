DESCRIPTION = "Launch and configuration files for calibrating Fetch using the 'robot_calibration' package."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = ""

RDEPENDS_${PN} = "robot-calibration"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_calibration/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f4fc67de7c678a2b5a55e597debc9b2"
SRC_URI[sha256sum] = "246ba4835fc72780262b5f3444bf03a93039c0b407594e84e7fb8274a3b7d2ee"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_calibration-0.8.2-1"

inherit catkin
