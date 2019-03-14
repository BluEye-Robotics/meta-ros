DESCRIPTION = "Utility functions for displaying and debugging data in Rviz via published markers"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " sensor-msgs eigen-conversions geometry-msgs roscpp tf-conversions visualization-msgs graph-msgs std-msgs trajectory-msgs roslint eigen-stl-containers libogre-dev libqt5x11extras5-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PickNikRobotics/rviz_visual_tools-release/archive/release/melodic/rviz_visual_tools/3.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "acafdb2e4c90f566518da55721d26dd8"
SRC_URI[sha256sum] = "e8e3e49bb0e1512cf87c0fbfe97639e415e0c304dc83bc357a0da93c56c45674"

S = "${WORKDIR}/rviz_visual_tools-release-release-melodic-rviz_visual_tools-3.7.0-0"

inherit catkin
