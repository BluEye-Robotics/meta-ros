DESCRIPTION = "Messages used by rocon devices"
AUTHOR = "Dongwook Lee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation std-msgs rocon-std-msgs message-runtime std-msgs rocon-std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs rocon-std-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/rocon_device_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd3f50e4fd8ebdea079d4d2710f4ab89"
SRC_URI[sha256sum] = "e2b55ec1c00c3c40fe7df6c19206e676fd8a3abff63bcd1bcd9531ddbb1036e8"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-rocon_device_msgs-0.9.0-0"

inherit catkin
