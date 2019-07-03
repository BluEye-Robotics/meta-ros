DESCRIPTION = "Shared communication types for the concert framework."
AUTHOR = "Jihoon Lee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "gateway-msgs message-generation rocon-app-manager-msgs rocon-std-msgs std-msgs uuid-msgs gateway-msgs message-runtime rocon-app-manager-msgs rocon-std-msgs std-msgs uuid-msgs"

RDEPENDS_${PN} = "gateway-msgs message-runtime rocon-app-manager-msgs rocon-std-msgs std-msgs uuid-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/concert_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ed50a1da07fcdb6f6ac47e890b3b8b50"
SRC_URI[sha256sum] = "2b90b553b2fc831b783dda1382fddbd81c507f33988189768ac44fc0106afac2"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-concert_msgs-0.9.0-0"

inherit catkin
