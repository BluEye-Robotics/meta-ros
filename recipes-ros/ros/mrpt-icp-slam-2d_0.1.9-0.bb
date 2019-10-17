DESCRIPTION = "mrpt_icp_slam_2d contains a wrapper on MRPT's 2D ICP-SLAM algorithms."
AUTHOR = "Jose Luis Blanco Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch roscpp roslib tf std-msgs sensor-msgs visualization-msgs nav-msgs mrpt-bridge dynamic-reconfigure mrpt1"

RDEPENDS_${PN} = " mrpt-rawlog"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_icp_slam_2d/0.1.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ffb303e33a153fc731c9996c76ed4891"
SRC_URI[sha256sum] = "aca7e53d844693e92f1d043660b5982dce6739932f68f63943fb87763bb6a616"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_icp_slam_2d-0.1.9-0"

inherit catkin
