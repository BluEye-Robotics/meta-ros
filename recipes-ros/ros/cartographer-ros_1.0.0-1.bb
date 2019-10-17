DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization and mapping (SLAM) in 2D and 3D across multiple platforms and sensor configurations. This package provides Cartographer's ROS integration."
AUTHOR = "The Cartographer Authors"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gmock g++-static protobuf-dev python3-sphinx cartographer cartographer-ros-msgs eigen-conversions geometry-msgs libgflags-dev libgoogle-glog-dev pcl message-runtime nav-msgs pcl-conversions robot-state-publisher rosbag roscpp roslaunch roslib sensor-msgs std-msgs tf2 tf2-eigen tf2-ros urdf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/cartographer_ros-release/archive/release/melodic/cartographer_ros/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6e69b660ead435438058e3ef823e213d"
SRC_URI[sha256sum] = "9e734459067f4d18a9458ad47b0b647c937521e650865a9d68380d4adca57c3b"

S = "${WORKDIR}/cartographer_ros-release-release-melodic-cartographer_ros-1.0.0-1"

inherit catkin
