DESCRIPTION = "qt_gui_py_common provides common functionality for GUI plugins written in Python."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python3-pyqt5 python3-rospkg python3-rospkg"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_py_common/0.3.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "20ef89251299f9d2e15422a59a3d3c00"
SRC_URI[sha256sum] = "ae08db249a7491a8ce21ba8a0e2b9463e1263d8c7fe29299c6768664e2fe5ce6"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_py_common-0.3.15-1"

inherit catkin
