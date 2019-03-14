DESCRIPTION = "This package contains adapters for using `nav_core` plugins as `nav_core2` plugins and vice versa (more or less). See README. md for more information."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "costmap-2d geometry-msgs nav-2d-msgs nav-2d-utils nav-core nav-core2 nav-grid nav-msgs pluginlib tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_core_adapter/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8f9bf91a666b545770372d5f034003f4"
SRC_URI[sha256sum] = "516bb752f040f0e9f4639d874211c75db1667265e326d1220d3b2f880729a336"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_core_adapter-0.2.5-1"

inherit catkin
