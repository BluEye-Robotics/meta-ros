DESCRIPTION = "A simple viewer for ROS image topics. Includes a specialized viewer for stereo + disparity images."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers cv-bridge dynamic-reconfigure gtk2 image-transport message-filters message-generation nodelet rosconsole roscpp sensor-msgs std-srvs stereo-msgs camera-calibration-parsers cv-bridge dynamic-reconfigure gtk2 image-transport message-filters nodelet rosconsole roscpp std-srvs"

RDEPENDS_${PN} = "camera-calibration-parsers cv-bridge dynamic-reconfigure gtk2 image-transport message-filters nodelet rosconsole roscpp std-srvs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_view/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "172cdfd656acd5ee768d80670fceaf0a"
SRC_URI[sha256sum] = "db828d83d6f3afbd0b9478c6311ea0da425a062269e91a001da1aaadcdabd5b4"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_view-1.12.23-0"

inherit catkin
