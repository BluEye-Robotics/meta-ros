DESCRIPTION = "qt_dotgraph provides helpers to work with dot graphs."
AUTHOR = "Thibault Kruse"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python3-pydot python3-pydot python3-pyqt5"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_dotgraph/0.3.14-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d1a10e6219b7f7c361613d51ad393428"
SRC_URI[sha256sum] = "4f4a3575f6867ebd3a21d402ac1ff176855f454f074051407078129e538a67dd"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_dotgraph-0.3.14-2"

inherit catkin
