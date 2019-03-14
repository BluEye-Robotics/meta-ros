DESCRIPTION = "This package is a wrapper for the implementation of EKF-based SLAM with range-bearing sensors, odometry, and a 2D (+heading) robot pose, and 2D landmarks."
AUTHOR = "Jose Luis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslaunch roslib tf std-msgs sensor-msgs visualization-msgs nav-msgs mrpt-bridge dynamic-reconfigure mrpt1"

RDEPENDS_${PN} = " mrpt-rawlog"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_ekf_slam_2d/0.1.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6280e95495cd7e692f4b4eadcd8530d0"
SRC_URI[sha256sum] = "bef95301350da744d7b45b651a029e3de2118f75f8e0c6b85dba8d09da58878c"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_ekf_slam_2d-0.1.8-0"

inherit catkin
