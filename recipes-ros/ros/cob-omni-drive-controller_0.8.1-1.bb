DESCRIPTION = "The cob_omni_drive_controller package"
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation angles boost cob-base-controller-utils controller-interface dynamic-reconfigure geometry-msgs hardware-interface nav-msgs pluginlib realtime-tools roscpp sensor-msgs std-msgs std-srvs tf tf2 urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_omni_drive_controller/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4d0ee2f60d7595022090775a4acf81e4"
SRC_URI[sha256sum] = "ee36867f9fc83fb99b6627e49fc510c211f69b8abee2b4868261d3b41de83ec1"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_omni_drive_controller-0.8.1-1"

inherit catkin
