DESCRIPTION = "This package provides a C++ interface for camera calibration information. It provides CameraInfo, and handles SetCameraInfo service requests, saving and restoring the camera calibration data."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost camera-calibration-parsers image-transport roscpp roslib rostest sensor-msgs boost camera-calibration-parsers image-transport roscpp roslib sensor-msgs"

RDEPENDS_${PN} = "boost camera-calibration-parsers image-transport roscpp roslib sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/melodic/camera_info_manager/1.11.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1ac538ff74bd50a73f191c29b21af6d7"
SRC_URI[sha256sum] = "c24f43db36b8922346fb722119850fdd6a0fafe87fa38521edba5c8c6ed4e98d"

ROS_SPN = "image_common"
S = "${WORKDIR}/image_common-release-release-melodic-camera_info_manager-1.11.13-0"

inherit catkin
