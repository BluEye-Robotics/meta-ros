DESCRIPTION = "cob_cam3d_throttle: only for Trottel"
AUTHOR = "Georg Arbeiter"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-filters nodelet pluginlib roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_cam3d_throttle/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72f60908baed53d82652819881bff2c6"
SRC_URI[sha256sum] = "4451dd7a369723340dba5a3f593d8923faa7924bacb7cd7575f815256c13c6e6"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_cam3d_throttle-0.6.14-1"

inherit catkin
