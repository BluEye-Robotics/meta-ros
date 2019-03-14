DESCRIPTION = "ROS messages for robots using FourWheelSteering."
AUTHOR = "Vincent Rousseau"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-drivers-gbp/four_wheel_steering_msgs-release/archive/release/melodic/four_wheel_steering_msgs/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "29f2284e68da39c7fe5254a617c0fa63"
SRC_URI[sha256sum] = "4089701e5cb0a7f06d6e42aef2863cd985f8e43d46d7aca46f5c0e01caaead86"

S = "${WORKDIR}/four_wheel_steering_msgs-release-release-melodic-four_wheel_steering_msgs-1.0.0-0"

inherit catkin
