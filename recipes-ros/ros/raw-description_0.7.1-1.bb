DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of the Care-O-bot robot. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-description gazebo-ros xacro"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/raw_description/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fe0b9dd751303a60a6e68562380be4c6"
SRC_URI[sha256sum] = "289f14730e2ab175508fa0268b95b411e8dcd30e090f825b586e611aeb43c90c"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-raw_description-0.7.1-1"

inherit catkin
