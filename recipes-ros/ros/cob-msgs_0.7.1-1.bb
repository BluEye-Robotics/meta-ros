DESCRIPTION = "Messages for representing state information, such as battery information and emergency stop status."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation diagnostic-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_msgs/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "252f1b7802dbd17fc5a08a7c81fb5d61"
SRC_URI[sha256sum] = "59363a11bfee152e46fc580aa8dc768ea9e8323f5e54e72634c9e4e057ea9ea0"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_msgs-0.7.1-1"

inherit catkin
