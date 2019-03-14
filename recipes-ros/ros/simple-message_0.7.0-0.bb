DESCRIPTION = "	simple_message defines a simple messaging connection and protocol for communicating 	with an industrial robot controller. Additional handler and manager classes are 	included for handling connection limited systems. This package is part of the ROS-Industrial 	program."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp industrial-msgs roscpp industrial-msgs"

RDEPENDS_${PN} = "roscpp industrial-msgs"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/simple_message/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "57d23157ada21da275a8499bb104ac1e"
SRC_URI[sha256sum] = "5c8e3ff246f5d757272ddf918cd28c6256bfca757437ec78fd606fc68ca53e87"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-simple_message-0.7.0-0"

inherit catkin
