DESCRIPTION = "This package is a wrapper for the implementation of EKF-based SLAM with range-bearing sensors, odometry, a full 6D robot pose, and 3D landmarks."
AUTHOR = "Jose Luis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslaunch roslib tf std-msgs sensor-msgs visualization-msgs nav-msgs mrpt-bridge dynamic-reconfigure cmake-modules mrpt1"

RDEPENDS_${PN} = " mrpt-rawlog"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_ekf_slam_3d/0.1.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "88a7af1719441e893964ff2fcc3fd0e5"
SRC_URI[sha256sum] = "033e62947e318122335f9c223589f340fa8425204178da6b817ea933c20973c5"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_ekf_slam_3d-0.1.8-0"

inherit catkin
