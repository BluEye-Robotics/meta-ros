DESCRIPTION = "This package defines messages for commonly used sensors, including cameras and scanning laser rangefinders."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation std-msgs geometry-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/sensor_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5409e980485dbb4cfc446c360526b322"
SRC_URI[sha256sum] = "25b8448825591eb461e1d3e24c32fd2a1f2e1e2e69c56bd67748c54c7f8d3529"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-sensor_msgs-1.12.7-0"

inherit catkin
