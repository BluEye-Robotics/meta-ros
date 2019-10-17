DESCRIPTION = "The ROS package for the RobotX competition running in Gazebo."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-ros gazebo-dev geographic-msgs joy joy-teleop message-runtime std-msgs wamv-gazebo wave-gazebo xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/vrx_gazebo/1.2.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4456e48f7bbabba95cff6820e39812e6"
SRC_URI[sha256sum] = "40c1c6e847bf627372b0c9320417f8fda63a7a676a637961a02d242e294b7fa8"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-vrx_gazebo-1.2.6-1"

inherit catkin
