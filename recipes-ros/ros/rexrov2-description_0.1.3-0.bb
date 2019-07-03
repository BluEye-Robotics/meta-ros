DESCRIPTION = "The robot description files for the RexROV 2 underwater vehicle"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros gazebo-ros-control uuv-assistants uuv-sensor-ros-plugins uuv-gazebo-ros-plugins uuv-descriptions robot-state-publisher xacro"

SRC_URI = "https://github.com/uuvsimulator/rexrov2-release/archive/release/melodic/rexrov2_description/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7dada6fd6a5882fed9925f10579c280b"
SRC_URI[sha256sum] = "a4da8b1fd519c66c4156c38ff1107731858cf630ef0194fd3fe2e5950a450940"

ROS_SPN = "rexrov2"
S = "${WORKDIR}/rexrov2-release-release-melodic-rexrov2_description-0.1.3-0"

inherit catkin
