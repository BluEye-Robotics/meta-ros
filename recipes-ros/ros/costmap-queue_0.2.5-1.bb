DESCRIPTION = "Tool for iterating through the cells of a costmap to find the closest distance to a subset of cells."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-core2 roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/costmap_queue/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aa37546ca03ca2f43acd2f1c0b4d9d50"
SRC_URI[sha256sum] = "12cc3931e8f432c3951f95fd4379597f05ec41815ccc9aea7da7c3c9a4a3839b"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-costmap_queue-0.2.5-1"

inherit catkin
