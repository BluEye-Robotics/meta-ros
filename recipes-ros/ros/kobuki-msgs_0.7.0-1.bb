DESCRIPTION = ""
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs actionlib-msgs message-generation std-msgs actionlib-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs actionlib-msgs message-runtime"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_msgs-release/archive/release/melodic/kobuki_msgs/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "583cd8f46d4af7f08319446fd4c7af05"
SRC_URI[sha256sum] = "11990d638a2cea62be1b3f6a33e17a6ac080ec52eda926bb69c173d7c14166ee"

S = "${WORKDIR}/kobuki_msgs-release-release-melodic-kobuki_msgs-0.7.0-1"

inherit catkin
