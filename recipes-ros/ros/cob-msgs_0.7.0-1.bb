DESCRIPTION = "Messages for representing state information, such as battery information and emergency stop status."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation diagnostic-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_msgs/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0280ab4971d22d16030ffb5dd78b98bd"
SRC_URI[sha256sum] = "b1bb794b3703a6ef5e48a27ad09777c2b0b0d0f30a468122a87bea3e5686b28b"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_msgs-0.7.0-1"

inherit catkin
