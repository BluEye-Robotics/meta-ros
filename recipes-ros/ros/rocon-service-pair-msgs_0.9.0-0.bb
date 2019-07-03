DESCRIPTION = "Paired pubsubs generators for non-blocking services."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation uuid-msgs rospy uuid-msgs message-runtime"

RDEPENDS_${PN} = "rospy uuid-msgs message-runtime"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/rocon_service_pair_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4ac10799b3904f35f00aa36184a1860c"
SRC_URI[sha256sum] = "28ec43f8619ea41e4562b0940174cf0cf8ff4c331ac0cda0dc9f1fb2dad5b0b6"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-rocon_service_pair_msgs-0.9.0-0"

inherit catkin
