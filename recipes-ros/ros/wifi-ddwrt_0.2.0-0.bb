DESCRIPTION = "Access to the DD-WRT wifi"
AUTHOR = "Scott Hassan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime rospy tf std-msgs pr2-msgs nav-msgs geometry-msgs visualization-msgs python-mechanize"

RDEPENDS_${PN} = "message-runtime rospy tf std-msgs pr2-msgs nav-msgs geometry-msgs visualization-msgs python-mechanize"

SRC_URI = "https://github.com/ros-gbp/wifi_ddwrt-release/archive/release/melodic/wifi_ddwrt/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2e43ddfc6ac811f1634982f164935c75"
SRC_URI[sha256sum] = "d9315fb98ca9d63cd7fd67895b3430e832d674a01469a5af7ec18fbd0c57dc7e"

S = "${WORKDIR}/wifi_ddwrt-release-release-melodic-wifi_ddwrt-0.2.0-0"

inherit catkin
