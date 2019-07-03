DESCRIPTION = "cv_camera uses OpenCV capture object to capture camera image. This supports camera_image and nodelet."
AUTHOR = "Takashi Ogura"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "opencv image-transport roscpp cv-bridge sensor-msgs nodelet camera-info-manager rostest roslint opencv image-transport roscpp cv-bridge sensor-msgs nodelet camera-info-manager"

RDEPENDS_${PN} = "opencv image-transport roscpp cv-bridge sensor-msgs nodelet camera-info-manager"

SRC_URI = "https://github.com/OTL/cv_camera-release/archive/release/melodic/cv_camera/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6c2334e9a54e07ac5303c0278a681a59"
SRC_URI[sha256sum] = "7119fcb01b7e39953f38be82f00d3ddf63ce52c92732091df65239b7824044dd"

S = "${WORKDIR}/cv_camera-release-release-melodic-cv_camera-0.4.0-1"

inherit catkin
