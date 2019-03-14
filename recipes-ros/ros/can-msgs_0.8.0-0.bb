DESCRIPTION = "CAN related message types."
AUTHOR = "Ivor Wanders"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/can_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "742cc8298da446571ca0ab94a413fbb2"
SRC_URI[sha256sum] = "54a5a705875b8d67403a724d0771fb4af9cdb1a9406504fe05cae90c43a813fa"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-can_msgs-0.8.0-0"

inherit catkin
