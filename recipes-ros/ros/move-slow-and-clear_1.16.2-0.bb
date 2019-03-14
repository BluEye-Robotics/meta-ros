DESCRIPTION = "move_slow_and_clear"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "cmake-modules costmap-2d geometry-msgs nav-core pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/move_slow_and_clear/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "02067cdc26b796885f04dcb30d136359"
SRC_URI[sha256sum] = "03d382b561c972861428737b3804a666bc1e8f20a962e160049cda6202c4bbd4"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-move_slow_and_clear-1.16.2-0"

inherit catkin
