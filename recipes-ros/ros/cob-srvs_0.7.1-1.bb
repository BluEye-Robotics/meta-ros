DESCRIPTION = "This Package contains Care-O-bot specific service definitions."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_srvs/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "19d84ab3b3ea5960482f2211c47a7180"
SRC_URI[sha256sum] = "9d921f5eaef707c1c9e09e5d80b3951f408bf5d57c448310372e8bb24f849f3c"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_srvs-0.7.1-1"

inherit catkin
