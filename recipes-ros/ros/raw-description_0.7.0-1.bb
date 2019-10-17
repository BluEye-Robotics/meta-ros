DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of the Care-O-bot robot. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-description gazebo-ros xacro"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/raw_description/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4d22ed1f0b3651f5b3cd160004ee83ef"
SRC_URI[sha256sum] = "ce900bda58a0cd4f3a66c730abca82ba216747258dc372fdc02d4fe530bf3a0c"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-raw_description-0.7.0-1"

inherit catkin
