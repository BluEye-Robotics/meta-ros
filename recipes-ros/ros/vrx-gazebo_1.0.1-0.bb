DESCRIPTION = "The ROS package for the RobotX competition running in Gazebo."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-ros gazebo-dev geographic-msgs joy joy-teleop message-runtime std-msgs wamv-gazebo xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/vrx_gazebo/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "31e4cd75dfa99045f279aec842aa9d4b"
SRC_URI[sha256sum] = "d6a4a9bdd86e6645bd539ec12ebcde5a87f46368643f4485561e3fae9478e951"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-vrx_gazebo-1.0.1-0"

inherit catkin
