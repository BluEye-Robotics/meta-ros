DESCRIPTION = "The robot_navigation package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "costmap-queue dlux-global-planner dlux-plugins dwb-critics dwb-local-planner dwb-msgs dwb-plugins global-planner-tests locomotor locomotor-msgs locomove-base nav-2d-msgs nav-2d-utils nav-core2 nav-core-adapter nav-grid nav-grid-iterators nav-grid-pub-sub"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/robot_navigation/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70daec82a0733004f1dae4af5c0dcdf7"
SRC_URI[sha256sum] = "c7d0ad170d41279ececdacd19f49e8e5116edf8b45a0be3f66a0fe5a707b9c08"

S = "${WORKDIR}/robot_navigation-release-release-melodic-robot_navigation-0.2.5-1"

inherit catkin
