DESCRIPTION = "The cob_base_controller_utils package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation geometry-msgs nav-msgs roscpp std-msgs std-srvs tf tf2 urdf message-runtime"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_base_controller_utils/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "34f80e5c770ec8877dd199d99e46e92e"
SRC_URI[sha256sum] = "2c2319407fb608a89d011c62d7d924610cbcc07e783d3c6147d4686d6e0a720d"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_base_controller_utils-0.8.1-1"

inherit catkin
