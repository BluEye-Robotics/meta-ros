DESCRIPTION = "The ROS package for the RobotX competition running in Gazebo."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-ros gazebo-dev geographic-msgs joy joy-teleop message-runtime std-msgs wamv-gazebo xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/vrx_gazebo/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f9b83a6d7815e5550e74b56d50a7174"
SRC_URI[sha256sum] = "0c34fdbb792526c2eca3da6c09044f4c2c83932092cd19310b40b1ff7e626c83"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-vrx_gazebo-1.1.1-1"

inherit catkin
