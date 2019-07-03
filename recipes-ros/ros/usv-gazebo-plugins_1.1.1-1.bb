DESCRIPTION = "Gazebo plugins for simulating Unmanned Surface Vehicles Originaly copied from https://github. com/bsb808/usv_gazebo_plugins"
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-ros gazebo-dev roscpp std-msgs libeigen xacro wave-gazebo-plugins"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/usv_gazebo_plugins/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18620b1d5f1d8ee9dfe142de4cd329ce"
SRC_URI[sha256sum] = "4a2e30aff5c7dc122588cf8e652b3f604521fac2fbfbfbafffd01009a6869fab"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-usv_gazebo_plugins-1.1.1-1"

inherit catkin
