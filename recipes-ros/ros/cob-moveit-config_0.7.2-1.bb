DESCRIPTION = "MoveIt config files for all cob and raw"
AUTHOR = "Mathias Luedtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/melodic/cob_moveit_config/0.7.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8cc3895bdbf50eea90cc60ad9bfafdce"
SRC_URI[sha256sum] = "56b6a43c6853718098e0579c0d34f6a48631aad9764fc2226aa817af8fda1e47"

ROS_SPN = "cob_robots"
S = "${WORKDIR}/cob_robots-release-release-melodic-cob_moveit_config-0.7.2-1"

inherit catkin
