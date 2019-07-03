DESCRIPTION = "Messages used by the rocon scheduler."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation rocon-std-msgs std-msgs uuid-msgs message-runtime rocon-std-msgs std-msgs uuid-msgs"

RDEPENDS_${PN} = "message-runtime rocon-std-msgs std-msgs uuid-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/scheduler_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f90d8702972bd8c379c67805efa36bd0"
SRC_URI[sha256sum] = "1b4d4544455c6a6b0cd9dfa8388e3f497ada0125fd906b544ccdb0d23a491a71"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-scheduler_msgs-0.9.0-0"

inherit catkin
