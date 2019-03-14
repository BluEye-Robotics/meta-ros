DESCRIPTION = "rqt_tf_tree provides a GUI plugin for visualizing the ROS TF frame tree."
AUTHOR = "Thibault Kruse"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs python-pyqt5 python-rospkg qt-dotgraph rospy rqt-graph rqt-gui rqt-gui-py tf2 tf2-msgs tf2-ros"

RDEPENDS_${PN} = "geometry-msgs python-pyqt5 python-rospkg qt-dotgraph rospy rqt-graph rqt-gui rqt-gui-py tf2 tf2-msgs tf2-ros"

SRC_URI = "https://github.com/ros-gbp/rqt_tf_tree-release/archive/release/melodic/rqt_tf_tree/0.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "19a8fc60313d1fd0d33f4c8847cda84d"
SRC_URI[sha256sum] = "c52046ad978eb9ae418a866706d9b909646dee0f8b76deed4fa501e0894c3ee4"

S = "${WORKDIR}/rqt_tf_tree-release-release-melodic-rqt_tf_tree-0.6.0-0"

inherit catkin
