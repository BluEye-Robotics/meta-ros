DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GUI."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"

RDEPENDS_${PN} = "qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_core/0.3.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "85d3d04cf0a74ad5f969bb31cf62a1bd"
SRC_URI[sha256sum] = "7e88f8db78ec7edc811a35dc989172dedfc4a180813104434a8fab5064cda22e"

S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_core-0.3.15-1"

inherit catkin
