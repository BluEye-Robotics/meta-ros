DESCRIPTION = "Gazebo plugins for simulating Unmanned Surface Vehicles Originaly copied from https://github. com/bsb808/usv_gazebo_plugins"
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-ros gazebo-dev roscpp std-msgs libeigen"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/usv_gazebo_plugins/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5a343a2aea6f214e9c84c896844c1b11"
SRC_URI[sha256sum] = "61bbed37ef07cd02e27f6710063400a17b259523bbe721a0f657120b3a3c11ad"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-usv_gazebo_plugins-1.0.1-0"

inherit catkin
