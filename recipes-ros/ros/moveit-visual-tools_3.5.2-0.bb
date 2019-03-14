DESCRIPTION = "Helper functions for displaying and debugging MoveIt! data in Rviz via published markers"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rviz-visual-tools tf2-eigen geometry-msgs moveit-ros-planning moveit-core roscpp tf2-ros visualization-msgs graph-msgs std-msgs trajectory-msgs roslint cmake-modules"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit_visual_tools-release/archive/release/melodic/moveit_visual_tools/3.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9dc314f7b764099af9ca342f3239a1b7"
SRC_URI[sha256sum] = "89188c2b6459781c14abe35014f937e5c199cd11f8fd45f943ff21e1b654ec84"

S = "${WORKDIR}/moveit_visual_tools-release-release-melodic-moveit_visual_tools-3.5.2-0"

inherit catkin
