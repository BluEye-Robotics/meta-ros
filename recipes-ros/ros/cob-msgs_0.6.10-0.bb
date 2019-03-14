DESCRIPTION = "Messages for representing state information, such as battery information and emergency stop status."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation diagnostic-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_msgs/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "85d81ef73713709ffdecf6cb816378d3"
SRC_URI[sha256sum] = "5315fb257fa9d304fc8c17dc86474a274637bfd422241d7914a592748536c1d0"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_msgs-0.6.10-0"

inherit catkin
