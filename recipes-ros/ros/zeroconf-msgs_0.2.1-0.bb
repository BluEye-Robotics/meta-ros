DESCRIPTION = "General ros communications used by the various zeroconf implementations."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/yujinrobot-release/zeroconf_msgs-release/archive/release/melodic/zeroconf_msgs/0.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "20a8712c21f372a6da57ff5e1df0e48d"
SRC_URI[sha256sum] = "2e5d7e5adc4153b4b1f9e166a13cd4ed2fdcb0944d966dfaaf6811e63b89cdef"

S = "${WORKDIR}/zeroconf_msgs-release-release-melodic-zeroconf_msgs-0.2.1-0"

inherit catkin
