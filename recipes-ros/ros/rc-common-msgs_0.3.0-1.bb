DESCRIPTION = "Common msg and srv definitions used by Roboception's ROS packages"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_common_msgs-release/archive/release/melodic/rc_common_msgs/0.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "84e973b820ef4f2ea8d81e72c62814bd"
SRC_URI[sha256sum] = "c1825f1534ee3e8186d61dff3462b0bf7fcd0e54104be8d09180220a5a1cd3c2"

S = "${WORKDIR}/rc_common_msgs-release-release-melodic-rc_common_msgs-0.3.0-1"

inherit catkin
