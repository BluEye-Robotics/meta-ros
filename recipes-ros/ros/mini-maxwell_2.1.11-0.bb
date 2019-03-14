DESCRIPTION = "mini_maxwell"
AUTHOR = "Yusuke Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules roslib dynamic-reconfigure dynamic-reconfigure"

RDEPENDS_${PN} = "dynamic-reconfigure"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/mini_maxwell/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d40eb042189e75633d856b643dd8c63d"
SRC_URI[sha256sum] = "a69fc95ceca0f3b9035039ac42b1805c74f2bb0f11dd017e7ec7fbbd1a531e7c"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-mini_maxwell-2.1.11-0"

inherit catkin
