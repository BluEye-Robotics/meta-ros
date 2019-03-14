DESCRIPTION = "qt_dotgraph provides helpers to work with dot graphs."
AUTHOR = "Thibault Kruse"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pydot python-pyqt5"

RDEPENDS_${PN} = "python-pydot python-pyqt5"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_dotgraph/0.3.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80ac238e56bb9722084b9222645f4ff0"
SRC_URI[sha256sum] = "c54d5f350840e358b0bfc662e83dd36ca7c6ceb2bb072a9d5d7b6f94ea8703d5"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_dotgraph-0.3.11-0"

inherit catkin
