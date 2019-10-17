DESCRIPTION = "This Package contains Care-O-bot specific service definitions."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_srvs/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "52d03afdd9b3aa6914d510508cbdc93b"
SRC_URI[sha256sum] = "1088b5dbe8ab9875e5f02cc74208dfa61f3d7f208c83b3cfe4be94c909c7e880"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_srvs-0.6.10-0"

inherit catkin
