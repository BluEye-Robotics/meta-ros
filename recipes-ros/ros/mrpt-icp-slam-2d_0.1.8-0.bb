DESCRIPTION = "mrpt_icp_slam_2d contains a wrapper on MRPT's 2D ICP-SLAM algorithms."
AUTHOR = "Jose Luis Blanco Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch roscpp roslib tf std-msgs sensor-msgs visualization-msgs nav-msgs mrpt-bridge dynamic-reconfigure mrpt1"

RDEPENDS_${PN} = " mrpt-rawlog"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_icp_slam_2d/0.1.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8c638e0039bde97a3824666ab708ecc6"
SRC_URI[sha256sum] = "a758de5b3c03eb824046bbc33e13759b0c233f87583b39f73b6689ba717a3846"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_icp_slam_2d-0.1.8-0"

inherit catkin
