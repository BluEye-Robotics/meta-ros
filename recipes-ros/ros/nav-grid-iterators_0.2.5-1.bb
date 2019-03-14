DESCRIPTION = "Iterator implementations for moving around the cells of a nav_grid in a number of common patterns."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-2d-msgs nav-2d-utils nav-grid nav-msgs roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_grid_iterators/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cb1c6b25de2b523a3ffe19e55e988685"
SRC_URI[sha256sum] = "85aa53f153880ee681412a6d1a963547b6110879d69db3fe24842cd9bcbd0200"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_grid_iterators-0.2.5-1"

inherit catkin
