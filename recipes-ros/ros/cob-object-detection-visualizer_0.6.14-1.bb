DESCRIPTION = "The cob_object_detection_visualizer package"
AUTHOR = "Richard Bormann"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost cob-object-detection-msgs cv-bridge eigen-conversions image-transport opencv pcl message-filters pcl-ros roscpp sensor-msgs visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_object_detection_visualizer/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "24c8cd83aef438380850b1356f015fc2"
SRC_URI[sha256sum] = "6f69b00121d7cb02ff0da6cbe8867092c3a752238dd84fa3664cb75ff6bf6df7"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_object_detection_visualizer-0.6.14-1"

inherit catkin
