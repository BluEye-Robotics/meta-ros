DESCRIPTION = "The cob_tricycle_controller package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "angles boost cob-base-controller-utils controller-interface geometry-msgs hardware-interface nav-msgs pluginlib realtime-tools roscpp std-srvs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_tricycle_controller/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f8bb4aaa1662bad2f368b9d1f7e31b83"
SRC_URI[sha256sum] = "27c1c03e70d7b4ef6981c4546eb50354cf1daedb705da774c3e85ea2dafa43eb"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_tricycle_controller-0.8.1-1"

inherit catkin
