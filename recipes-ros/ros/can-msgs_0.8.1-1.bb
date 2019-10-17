DESCRIPTION = "CAN related message types."
AUTHOR = "Ivor Wanders"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/can_msgs/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0d8cebf86700989610e35325eff9cdb3"
SRC_URI[sha256sum] = "1a46406026c0cf2affec4efd5e03f49c45e0a47375196a13b1c5a8b831328c6c"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-can_msgs-0.8.1-1"

inherit catkin
