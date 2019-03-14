DESCRIPTION = "Extracts checkerboard corners from a dense laser snapshot. This package is experimental and unstable. Expect its APIs to change."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs cv-bridge image-cb-detector message-filters roscpp settlerlib std-msgs actionlib actionlib-msgs cv-bridge image-cb-detector message-filters roscpp settlerlib std-msgs"

RDEPENDS_${PN} = "actionlib actionlib-msgs cv-bridge image-cb-detector message-filters roscpp settlerlib std-msgs"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/laser_cb_detector/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b57cadf6813422bcd466183116eb9954"
SRC_URI[sha256sum] = "84dfc40a2bed5cc329a50aba2e513550e8a8aa9de1b0d0719676e04ee3107d7e"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-laser_cb_detector-0.10.14-0"

inherit catkin
