DESCRIPTION = "A collection of ROS utilities for using WebRTC with ROS"
AUTHOR = "Mitchell Wills"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge roscpp webrtc image-transport nodelet async-web-server-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/RobotWebTools-release/webrtc_ros-release/archive/release/melodic/webrtc_ros/59.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "05b489396420aadfa07522ec9649b0ea"
SRC_URI[sha256sum] = "2e24d39a6cf8c98c8f2b9229dd5a0fabd731cf495abf76547baf476d26b98f96"

S = "${WORKDIR}/webrtc_ros-release-release-melodic-webrtc_ros-59.0.3-0"

inherit catkin
