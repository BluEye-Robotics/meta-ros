DESCRIPTION = "Gazebo plugins for simulating Unmanned Surface Vehicles Originaly copied from https://github. com/bsb808/usv_gazebo_plugins"
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-ros gazebo-dev roscpp std-msgs libeigen xacro wave-gazebo-plugins"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/usv_gazebo_plugins/1.2.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d7e083ccd6cbc95bc1cd1ea534ffb8d2"
SRC_URI[sha256sum] = "58313c1a2661211d5df57f609b4e7a3ab81a75d17ff91cbdba4bebb651431b3e"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-usv_gazebo_plugins-1.2.6-1"

inherit catkin
