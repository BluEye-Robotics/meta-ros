DESCRIPTION = "Launch and configuration files for calibrating Fetch using the 'robot_calibration' package."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = ""

RDEPENDS_${PN} = "robot-calibration"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_calibration/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94fe36ca632b4cc406e41977c09b1ba7"
SRC_URI[sha256sum] = "721f6d930a2272ade866193f850e96785ed5d2f3a40244857e79ae7bc1ac1546"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_calibration-0.8.0-0"

inherit catkin
