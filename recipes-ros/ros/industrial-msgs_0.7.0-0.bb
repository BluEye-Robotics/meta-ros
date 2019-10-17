DESCRIPTION = "	The industrial message package containes industrial specific messages 	definitions. This package is part of the ROS-Industrial program."
AUTHOR = "Shaun M. Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs trajectory-msgs genmsg message-generation std-msgs trajectory-msgs genmsg message-runtime"

RDEPENDS_${PN} = "std-msgs trajectory-msgs genmsg message-runtime"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_msgs/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "32fd1c83e97989ec292d46c07632f4e4"
SRC_URI[sha256sum] = "dfccafb19b7d79ae310f7ed1b741b2d11921c5392d0bc4f45257738b8f7bba47"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_msgs-0.7.0-0"

inherit catkin
