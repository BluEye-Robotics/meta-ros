DESCRIPTION = "The cob_hand_bridge package"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib angles control-msgs diagnostic-updater sensor-msgs std-srvs"

RDEPENDS_${PN} = "message-runtime rosserial-python std-msgs"

SRC_URI = "https://github.com/ipa320/cob_hand-release/archive/release/melodic/cob_hand_bridge/0.6.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e411fc4e3d3ff6e16fc49782317fa8d1"
SRC_URI[sha256sum] = "6849d1db4ffd4043e6c46027bbfe6a0f1f2f5fef2951015c15989182299b8845"

ROS_SPN = "cob_hand"
S = "${WORKDIR}/cob_hand-release-release-melodic-cob_hand_bridge-0.6.6-1"

inherit catkin
