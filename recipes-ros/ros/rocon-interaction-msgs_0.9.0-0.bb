DESCRIPTION = "Messages used by rocon interactions."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation rocon-std-msgs uuid-msgs message-runtime rocon-std-msgs uuid-msgs"

RDEPENDS_${PN} = "message-runtime rocon-std-msgs uuid-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/rocon_interaction_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4f851ce6ff2ed3607de3d2d1d707e8e4"
SRC_URI[sha256sum] = "b33c21e3c041db8fed2c23d369b2d9233da6f1f4008d82940be8a1fe236a9efb"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-rocon_interaction_msgs-0.9.0-0"

inherit catkin
