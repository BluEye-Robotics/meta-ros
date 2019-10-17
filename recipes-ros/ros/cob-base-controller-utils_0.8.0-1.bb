DESCRIPTION = "The cob_base_controller_utils package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation geometry-msgs nav-msgs roscpp std-msgs std-srvs tf tf2 urdf message-runtime"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_base_controller_utils/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "90e98776d24f9b43130838606d3da05d"
SRC_URI[sha256sum] = "5bc959ee2f52d5457a0e0b41f4f3e78e502d103c86fe2e53ba07183f43008347"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_base_controller_utils-0.8.0-1"

inherit catkin
