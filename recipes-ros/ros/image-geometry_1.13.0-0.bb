DESCRIPTION = "`image_geometry` contains C++ and Python libraries for interpreting images geometrically. It interfaces the calibration parameters in sensor_msgs/CameraInfo messages with OpenCV functions such as image rectification, much as cv_bridge interfaces ROS sensor_msgs/Image with OpenCV data types."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "opencv sensor-msgs opencv sensor-msgs"

RDEPENDS_${PN} = "opencv"

SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/melodic/image_geometry/1.13.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd627f947467d76a68b636c9d01d1439"
SRC_URI[sha256sum] = "f1f06fc227662b34743a3391431538326fa3c8833c7ab47b6b1eeeeb631082e2"

ROS_SPN = "vision_opencv"
S = "${WORKDIR}/vision_opencv-release-release-melodic-image_geometry-1.13.0-0"

inherit catkin
