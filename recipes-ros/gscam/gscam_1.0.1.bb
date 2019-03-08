DESCRIPTION = "A ROS camera driver that uses gstreamer to connect to devices such as webcams."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gstreamer gst-plugins-base gst-plugins-good nodelet opencv roscpp image-transport sensor-msgs \
    camera-calibration-parsers camera-info-manager"

SRC_URI = "https://github.com/ros-drivers-gbp/gscam-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6567623f010194a409217c757a9b8fe2"
SRC_URI[sha256sum] = "c9b0612c0db015a239ed78e7cb445116f02c3212950858d9f0c7e33e2262db13"

inherit catkin
