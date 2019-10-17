DESCRIPTION = "qt_gui_py_common provides common functionality for GUI plugins written in Python."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pyqt5 python-rospkg"

RDEPENDS_${PN} = "python-pyqt5 python-rospkg"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_py_common/0.3.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d8618629ef9ef3baa899c9d185212cf1"
SRC_URI[sha256sum] = "d665864b786a0267d7c9ad26cc7d0af998b4e51b99941e43cd551cf4b0c08cae"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_py_common-0.3.11-0"

inherit catkin
