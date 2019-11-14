DESCRIPTION = "qt_dotgraph provides helpers to work with dot graphs."
AUTHOR = "Thibault Kruse"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python-pydot python-pyqt5"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_dotgraph/0.3.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "82f80045baeaf692171abab74a139e00"
SRC_URI[sha256sum] = "9c2b54e2ef865ad489d11dec99ec68fdadc3665dcee57ed5ce432563881edbde"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_dotgraph-0.3.15-1"

inherit catkin
