DESCRIPTION = "Provides ROS plugins that offer message and service publishers for interfacing with"
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cmake-modules gazebo-dev gazebo-msgs roslib roscpp tf std-srvs rosgraph-msgs dynamic-reconfigure std-msgs geometry-msgs libtinyxml"

RDEPENDS_${PN} = "gazebo-dev python-argparse"

SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/melodic/gazebo_ros/2.8.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c680876f0f7d33bd5c0fa1571efd9170"
SRC_URI[sha256sum] = "fde5c96dfbdfcd8550ae4b731d199348b50955157f0bc114f754c5a55170ca8a"

ROS_SPN = "gazebo_ros_pkgs"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-melodic-gazebo_ros-2.8.4-0"

inherit catkin
