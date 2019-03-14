DESCRIPTION = "Calibrate a Robot"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "actionlib camera-calibration-parsers control-msgs cv-bridge geometry-msgs kdl-parser moveit-msgs nav-msgs orocos-kdl pluginlib robot-calibration-msgs roscpp rosbag sensor-msgs std-msgs tf tf2-geometry-msgs tf2-ros visualization-msgs libceres-dev libgflags-dev suitesparse protobuf-dev actionlib camera-calibration-parsers control-msgs cv-bridge geometry-msgs kdl-parser moveit-msgs nav-msgs orocos-kdl pluginlib robot-calibration-msgs roscpp rosbag sensor-msgs std-msgs tf tf2-geometry-msgs tf2-ros visualization-msgs libceres-dev suitesparse protobuf-dev"

RDEPENDS_${PN} = "actionlib camera-calibration-parsers control-msgs cv-bridge geometry-msgs kdl-parser moveit-msgs nav-msgs orocos-kdl pluginlib robot-calibration-msgs roscpp rosbag sensor-msgs std-msgs tf tf2-geometry-msgs tf2-ros visualization-msgs libceres-dev suitesparse protobuf-dev"

SRC_URI = "https://github.com/ros-gbp/robot_calibration-release/archive/release/melodic/robot_calibration/0.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c9293d1b060d6ccf5cdf8a8c57723177"
SRC_URI[sha256sum] = "bd39604970ae9dd0a27d006fac49afbf50604f89ff7d7218e4967c91d866b175"

S = "${WORKDIR}/robot_calibration-release-release-melodic-robot_calibration-0.6.0-0"

inherit catkin
