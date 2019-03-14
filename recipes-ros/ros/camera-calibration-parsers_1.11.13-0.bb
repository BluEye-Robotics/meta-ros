DESCRIPTION = "camera_calibration_parsers contains routines for reading and writing camera calibration parameters."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost pkgconfig rosconsole sensor-msgs yaml-cpp roscpp roscpp-serialization boost sensor-msgs yaml-cpp roscpp roscpp-serialization"

RDEPENDS_${PN} = "boost sensor-msgs yaml-cpp roscpp roscpp-serialization"

SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/melodic/camera_calibration_parsers/1.11.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5165f740059a921f23d51421fa9a105e"
SRC_URI[sha256sum] = "dd350061b03da5dba0315515f603daa31204e71c43389cf9e57bf09c06d8d3ef"

ROS_SPN = "image_common"
S = "${WORKDIR}/image_common-release-release-melodic-camera_calibration_parsers-1.11.13-0"

inherit catkin
