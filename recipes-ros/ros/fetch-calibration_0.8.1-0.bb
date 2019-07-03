DESCRIPTION = "Launch and configuration files for calibrating Fetch using the 'robot_calibration' package."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = ""

RDEPENDS_${PN} = "robot-calibration"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_calibration/0.8.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e66d34182101745ae6e1fb8c7c6bf06a"
SRC_URI[sha256sum] = "38c0c089729fa01add0ebd3318007f044b0ac9c1ca4eadf6bb58e0925f7a8716"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_calibration-0.8.1-0"

inherit catkin
