DESCRIPTION = "	The industrial message package containes industrial specific messages 	definitions. This package is part of the ROS-Industrial program."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs trajectory-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_msgs/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a6ea3fd45c4409bd2c8728ed8902975f"
SRC_URI[sha256sum] = "1bda13baa0f9ee548fc5bf8699772ab77543e3fc4ac26a7c46282583bc003531"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_msgs-0.7.1-1"

inherit catkin
