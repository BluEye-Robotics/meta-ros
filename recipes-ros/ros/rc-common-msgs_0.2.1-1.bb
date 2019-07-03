DESCRIPTION = "Common msg and srv definitions used by Roboception's ROS packages"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_common_msgs-release/archive/release/melodic/rc_common_msgs/0.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "137d12d72bcb1abc8442943b050e0e85"
SRC_URI[sha256sum] = "0510e2724b20be04c132d6218f0e411382934c9ebb5c5f8254b87b8db903f3ce"

S = "${WORKDIR}/rc_common_msgs-release-release-melodic-rc_common_msgs-0.2.1-1"

inherit catkin
