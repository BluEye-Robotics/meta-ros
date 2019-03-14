DESCRIPTION = "A ROS camera driver that uses gstreamer to connect to devices such as webcams."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base nodelet cv-bridge roscpp image-transport sensor-msgs camera-calibration-parsers camera-info-manager nodelet cv-bridge roscpp image-transport sensor-msgs camera-calibration-parsers camera-info-manager"

RDEPENDS_${PN} = "nodelet cv-bridge roscpp image-transport sensor-msgs camera-calibration-parsers camera-info-manager"

SRC_URI = "https://github.com/ros-drivers-gbp/gscam-release/archive/release/melodic/gscam/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d6afd8c018bb5c5104a2b17aa4dab332"
SRC_URI[sha256sum] = "bbd838538ef852691f2de43b5b0a5541e0b8f4a8bd1c5ef7d0bb5c5387491996"

S = "${WORKDIR}/gscam-release-release-melodic-gscam-1.0.1-0"

inherit catkin
