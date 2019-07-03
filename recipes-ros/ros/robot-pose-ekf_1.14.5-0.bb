DESCRIPTION = "The Robot Pose EKF package is used to estimate the 3D pose of a robot, based on (partial) pose measurements coming from different sources. It uses an extended Kalman filter with a 6D model (3D position and 3D orientation) to combine measurements from wheel odometry, IMU sensor and visual odometry. The basic idea is to offer loosely coupled integration with different sensors, where sensor signals are received as ROS messages."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "message-generation roscpp bfl std-msgs geometry-msgs sensor-msgs nav-msgs tf message-generation message-runtime roscpp bfl std-msgs geometry-msgs sensor-msgs nav-msgs tf"

RDEPENDS_${PN} = "message-runtime roscpp bfl std-msgs geometry-msgs sensor-msgs nav-msgs tf"

SRC_URI = "https://github.com/ros-gbp/robot_pose_ekf-release/archive/release/melodic/robot_pose_ekf/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "76b6dbe3e9a4761a3cc75529809d1a61"
SRC_URI[sha256sum] = "5c00ee700ca2a69ca46e5162fa0bf0570a730ff566808059d7c6358fe350844a"

S = "${WORKDIR}/robot_pose_ekf-release-release-melodic-robot_pose_ekf-1.14.5-0"

inherit catkin
