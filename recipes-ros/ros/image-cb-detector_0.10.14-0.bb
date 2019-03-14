DESCRIPTION = "Provide a node that extracts checkerboard corners from ROS images. This package is still experimental and unstable. Expect its APIs to change."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs calibration-msgs cv-bridge geometry-msgs image-transport message-filters message-generation roscpp sensor-msgs std-msgs actionlib actionlib-msgs calibration-msgs cv-bridge geometry-msgs image-transport message-filters message-runtime roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = "actionlib actionlib-msgs calibration-msgs cv-bridge geometry-msgs image-transport message-filters message-runtime roscpp sensor-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/image_cb_detector/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ac417af6e0cfa37971e99009f089320"
SRC_URI[sha256sum] = "b979f5db4bef45b9072a8392e5abb0f8608a5ebd06ba6dbbb5c51cb48e2ed335"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-image_cb_detector-0.10.14-0"

inherit catkin
