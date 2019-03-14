DESCRIPTION = "A path planner library and node."
AUTHOR = "David Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles tf2-geometry-msgs costmap-2d dynamic-reconfigure geometry-msgs nav-core nav-msgs navfn pluginlib roscpp tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/global_planner/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "713ba51d1578ca679c8e942c5b19e900"
SRC_URI[sha256sum] = "78802bdb91c6f0e8f194cbe2cfd7b68dca7a4c394c219aa8aba1b17d31e48c1a"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-global_planner-1.16.2-0"

inherit catkin
