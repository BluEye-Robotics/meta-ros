DESCRIPTION = "Publishers and Subscribers for nav_grid data."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs map-msgs nav-2d-msgs nav-2d-utils nav-core2 nav-grid nav-grid-iterators nav-msgs roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_grid_pub_sub/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5afb60fbd5af2f8ba1bf1c360b7ecbe3"
SRC_URI[sha256sum] = "e2d1c5f03e225c1972d664a489216e5d37b8bf1284da2338b344637a44d48b39"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_grid_pub_sub-0.2.5-1"

inherit catkin
