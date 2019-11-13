DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical user interface provided by qt_gui."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui"

RDEPENDS_${PN} = "qt-gui"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_app/0.3.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9a9b8fcd708f004a78f2173b9eb4226"
SRC_URI[sha256sum] = "4a844c1f2f020e5bd924bb25423dc0539013bf9eae996eb55441a60d4a3c2bce"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_app-0.3.15-1"

inherit catkin
