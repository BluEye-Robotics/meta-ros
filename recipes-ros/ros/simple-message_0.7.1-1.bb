DESCRIPTION = "	simple_message defines a simple messaging connection and protocol for communicating 	with an industrial robot controller. Additional handler and manager classes are 	included for handling connection limited systems. This package is part of the ROS-Industrial 	program."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp industrial-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/simple_message/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "83943d5010532b20d2b00933cdae4fd4"
SRC_URI[sha256sum] = "1a173646a6fb15387eea9bb6c7d9225f28c8506e36aebde93667dbefa65c8721"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-simple_message-0.7.1-1"

inherit catkin
