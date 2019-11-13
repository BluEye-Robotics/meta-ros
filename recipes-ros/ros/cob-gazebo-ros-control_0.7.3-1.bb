DESCRIPTION = "This package contains a specialization of the gazebo_ros_control plugin. The cob_gazebo_ros_control plugin allows Multi-HardwareInterface-Support."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "controller-manager gazebo-ros-control gazebo-ros hardware-interface joint-limits-interface pluginlib roscpp transmission-interface urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_gazebo_plugins-release/archive/release/melodic/cob_gazebo_ros_control/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2411653acc452787f177ca68cd2c2eb3"
SRC_URI[sha256sum] = "a4f50274e0b24a27cdf983d3a4b1827c38065df889c876a1238a51f840e40f04"

ROS_SPN = "cob_gazebo_plugins"
S = "${WORKDIR}/cob_gazebo_plugins-release-release-melodic-cob_gazebo_ros_control-0.7.3-1"

inherit catkin
