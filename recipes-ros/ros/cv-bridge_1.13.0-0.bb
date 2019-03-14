DESCRIPTION = "This contains CvBridge, which converts between ROS Image messages and OpenCV images."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost opencv python  rosconsole sensor-msgs opencv sensor-msgs"

RDEPENDS_${PN} = "boost opencv python  rosconsole"

SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/melodic/cv_bridge/1.13.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49fa9e8fe00ff37cbc8ad3b0b3a1ed50"
SRC_URI[sha256sum] = "fb812741718a40399f538eaef7c887b79004afcdbe0271b3258c5c8ee9c55023"

ROS_SPN = "vision_opencv"
S = "${WORKDIR}/vision_opencv-release-release-melodic-cv_bridge-1.13.0-0"

inherit catkin
