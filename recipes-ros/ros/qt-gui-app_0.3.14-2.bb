DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical user interface provided by qt_gui."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui"

RDEPENDS_${PN} = "qt-gui"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_app/0.3.14-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b930f7fc3f8f2d896ea3873c6679e6ab"
SRC_URI[sha256sum] = "fccdc1b95e137456830aaee1b46e1a368cc9ae9cb475b968d5aaedeba91c742d"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_app-0.3.14-2"

inherit catkin
