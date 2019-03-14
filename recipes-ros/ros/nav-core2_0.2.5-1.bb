DESCRIPTION = "Interfaces for Costmap, LocalPlanner and GlobalPlanner. Replaces nav_core."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-2d-msgs nav-grid tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_core2/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5cb50b76d4a396a0d77bb8ceef69ac8e"
SRC_URI[sha256sum] = "94c6fcca1da21c14adf210a38a1e83c82fb7d3e59818b16004361800809031d9"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_core2-0.2.5-1"

inherit catkin
