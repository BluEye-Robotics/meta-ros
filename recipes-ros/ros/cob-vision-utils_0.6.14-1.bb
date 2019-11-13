DESCRIPTION = "Contains utilities used within the object detection tool chain."
AUTHOR = "Jan Fischer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cmake-modules opencv roscpp libtinyxml visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_vision_utils/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2e982cf89fc7153c8efd70c8b99da64f"
SRC_URI[sha256sum] = "0894dd4b7fc497310d4c8236696415b60d40314380217ee024058833f1944fa4"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_vision_utils-0.6.14-1"

inherit catkin
