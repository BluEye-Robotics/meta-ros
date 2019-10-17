DESCRIPTION = "This Package contains Care-O-bot specific service definitions."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_srvs/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5d5b28d62d62218239effe69a397dffa"
SRC_URI[sha256sum] = "05aa981d5ad1bbb9eefa20869023027e4eff226dde0448ee1d515fa20e9096b4"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_srvs-0.7.0-1"

inherit catkin
