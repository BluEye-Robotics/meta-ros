DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GUI."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"

RDEPENDS_${PN} = "qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_core/0.3.14-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dd2cd82a2795e8fc2c2c6d8ee6ea7615"
SRC_URI[sha256sum] = "68b1c64f721c85174f63579a28dea63ebf732d27ae1270f1bb529e6a2a3f7789"

S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_core-0.3.14-2"

inherit catkin
