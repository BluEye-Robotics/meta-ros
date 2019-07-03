DESCRIPTION = "Messages used by the gateway model."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/gateway_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b8729ce1b6dead053b8a7d5434cd7531"
SRC_URI[sha256sum] = "a9b6276a77498772c62e18a0f864bb657ab32a661cc4d7c150910462a4d97bc4"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-gateway_msgs-0.9.0-0"

inherit catkin
