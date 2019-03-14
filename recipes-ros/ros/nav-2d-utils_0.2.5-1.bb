DESCRIPTION = "A handful of useful utility functions for nav_core2 packages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs nav-2d-msgs nav-core2 nav-grid nav-msgs pluginlib roscpp std-msgs tf tf2-ros tf2-geometry-msgs xmlrpcpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_2d_utils/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e76bed9a2e977a874a043d206bf6f40"
SRC_URI[sha256sum] = "8af155a85dbda95feb762385cd888cd2d9296f39e444549f51d99872303e5e20"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_2d_utils-0.2.5-1"

inherit catkin
