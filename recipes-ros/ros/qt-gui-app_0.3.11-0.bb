DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical user interface provided by qt_gui."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui"

RDEPENDS_${PN} = "qt-gui"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_app/0.3.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5fdba7d976fee31bbf3701ea51138261"
SRC_URI[sha256sum] = "9906def7abafbaa4151394b237533e1e449743d63ba183d32b33f303fd1e2907"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_app-0.3.11-0"

inherit catkin
