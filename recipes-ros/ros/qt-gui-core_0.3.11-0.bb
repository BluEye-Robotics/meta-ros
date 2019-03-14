DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GUI."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"

RDEPENDS_${PN} = "qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_core/0.3.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fbef72e207a2b6460a2f6a34dfa35b6a"
SRC_URI[sha256sum] = "c49816fb690393c749f341c95ac6e0ee7000121701ea3ec5597297712d90aa9a"

S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_core-0.3.11-0"

inherit catkin
