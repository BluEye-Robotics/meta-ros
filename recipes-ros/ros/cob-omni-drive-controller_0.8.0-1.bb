DESCRIPTION = "The cob_omni_drive_controller package"
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation angles boost cob-base-controller-utils controller-interface dynamic-reconfigure geometry-msgs hardware-interface nav-msgs pluginlib realtime-tools roscpp sensor-msgs std-msgs std-srvs tf tf2 urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_omni_drive_controller/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf3568b399a428d70f1a6336705b2bc9"
SRC_URI[sha256sum] = "44ddfa24fff24069f7fc4aea2d49a8b33d2ba9b85d116bd0178cb1955671082d"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_omni_drive_controller-0.8.0-1"

inherit catkin
