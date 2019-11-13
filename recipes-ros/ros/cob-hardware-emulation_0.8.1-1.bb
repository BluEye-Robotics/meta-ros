DESCRIPTION = "The cob_hardware_emulation package"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "actionlib control-msgs nav-msgs rospy sensor-msgs std-srvs tf-conversions tf2-ros"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_hardware_emulation/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ac75b55b755135fdb962381051d82ba3"
SRC_URI[sha256sum] = "8646a2e4321a0d1ec4b879c791d201041573cfde46cde0a5066e4ece0ca3f44c"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_hardware_emulation-0.8.1-1"

inherit catkin
