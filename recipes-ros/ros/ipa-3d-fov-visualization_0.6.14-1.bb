DESCRIPTION = "The ipa_3d_fov_visualization package"
AUTHOR = "Florenz Graf"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cv-bridge image-geometry roscpp sensor-msgs visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/ipa_3d_fov_visualization/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9573495c58456661bb954e086d97eb22"
SRC_URI[sha256sum] = "3292a38aa2ff33ae3f094e672e3e7f74e919f0dcba2b05f3bda5530b8cb557d9"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-ipa_3d_fov_visualization-0.6.14-1"

inherit catkin
