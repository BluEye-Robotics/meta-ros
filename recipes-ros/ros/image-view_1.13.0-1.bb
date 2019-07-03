DESCRIPTION = "A simple viewer for ROS image topics. Includes a specialized viewer for stereo + disparity images."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers cv-bridge dynamic-reconfigure gtk2 image-transport message-filters message-generation nodelet rosconsole roscpp sensor-msgs std-srvs stereo-msgs camera-calibration-parsers cv-bridge dynamic-reconfigure gtk2 image-transport message-filters nodelet rosconsole roscpp std-srvs"

RDEPENDS_${PN} = "camera-calibration-parsers cv-bridge dynamic-reconfigure gtk2 image-transport message-filters nodelet rosconsole roscpp std-srvs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_view/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "83c1c76c0c89e3ebff390c5797d62206"
SRC_URI[sha256sum] = "fc40f5ff8c4840e241be2c61a4cec0fa5cb904134352249cde4f5df0ff63bf62"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_view-1.13.0-1"

inherit catkin
