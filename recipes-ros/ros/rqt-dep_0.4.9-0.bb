DESCRIPTION = "rqt_dep provides a GUI plugin for visualizing the ROS dependency graph."
AUTHOR = "Thibault Kruse"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pyqt5 python-rospkg qt-dotgraph qt-gui qt-gui-py-common rqt-graph rqt-gui-py"

RDEPENDS_${PN} = "python-pyqt5 python-rospkg qt-dotgraph qt-gui qt-gui-py-common rqt-graph rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_dep-release/archive/release/melodic/rqt_dep/0.4.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c29ca8c41c8744b8be0b085c916c1dd7"
SRC_URI[sha256sum] = "7fa60310716f75eb444c3f45578111826f1e2bcdc092a1a5b530bfef04b8fb7a"

S = "${WORKDIR}/rqt_dep-release-release-melodic-rqt_dep-0.4.9-0"

inherit catkin
