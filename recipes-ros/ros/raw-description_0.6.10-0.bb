DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of the Care-O-bot robot. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-description gazebo-ros xacro"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/raw_description/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d3e37df8b2e1c7a3d09cbb71be4188cb"
SRC_URI[sha256sum] = "6e238ded8f4fde81b5e6244573d2b29fe9523662f034833d4c8d8252f6ecaf1e"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-raw_description-0.6.10-0"

inherit catkin
