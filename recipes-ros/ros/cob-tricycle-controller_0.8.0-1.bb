DESCRIPTION = "The cob_tricycle_controller package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "angles boost cob-base-controller-utils controller-interface geometry-msgs hardware-interface nav-msgs pluginlib realtime-tools roscpp std-srvs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_tricycle_controller/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "73a41aebe57fd1c2b09db10f67dd0ddb"
SRC_URI[sha256sum] = "7bad482c1b60c3380122a76f551ba22792c32356318a0e9cf8a638b8a1061201"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_tricycle_controller-0.8.0-1"

inherit catkin
