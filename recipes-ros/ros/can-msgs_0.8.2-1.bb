DESCRIPTION = "CAN related message types."
AUTHOR = "Ivor Wanders"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/can_msgs/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f960843b00124a71c2b5fe5c6308f672"
SRC_URI[sha256sum] = "864dd2e7369c66fb42ff0293fd9702e094215c73a420899118965d4853ba4240"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-can_msgs-0.8.2-1"

inherit catkin
