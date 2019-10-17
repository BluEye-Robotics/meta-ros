DESCRIPTION = "This stack provides utilities commonly needed for a variety of computer vision tasks."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-3d-mapping-msgs cob-cam3d-throttle cob-image-flip cob-object-detection-msgs cob-object-detection-visualizer cob-perception-msgs cob-vision-utils"

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_perception_common/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "577c374725ead493ed67f99dcb98f7ff"
SRC_URI[sha256sum] = "97bfc63a8a31d06503529bb80f7aa1c04f59b2872541c970c21a9e8a8677f11c"

S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_perception_common-0.6.14-1"

inherit catkin
