DESCRIPTION = "GPS messages and common routines for use in GPS drivers"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-filters message-generation nav-msgs roscpp sensor-msgs std-msgs rospy message-filters message-runtime nav-msgs roscpp sensor-msgs std-msgs rospy"

RDEPENDS_${PN} = "message-filters message-runtime nav-msgs roscpp sensor-msgs std-msgs rospy"

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gps_common/0.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "deb92b6c0880e4e24929ddadda03bbc9"
SRC_URI[sha256sum] = "6c93231496ab9c5306b995bab4144a1db30024c62f7247f3cfb6efd96d617b2c"

ROS_SPN = "gps_umd"
S = "${WORKDIR}/gps_umd-release-release-melodic-gps_common-0.3.0-1"

inherit catkin
