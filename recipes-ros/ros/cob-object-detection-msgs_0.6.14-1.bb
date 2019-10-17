DESCRIPTION = "This package contains message type definitions for object detection"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs geometry-msgs sensor-msgs std-msgs std-srvs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_object_detection_msgs/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "854195cea45e3a6a8cfe28a6281eabf0"
SRC_URI[sha256sum] = "973a7ecbb144a06fe0ca33c7547a9d365e30d1b3fc4aefc715db24719e01402b"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_object_detection_msgs-0.6.14-1"

inherit catkin
