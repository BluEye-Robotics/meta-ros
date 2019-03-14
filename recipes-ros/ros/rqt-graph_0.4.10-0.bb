DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS computation graph."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pyqt5 python-rospkg qt-dotgraph rosgraph rosgraph-msgs roslib rosnode rospy rosservice rostopic rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "python-pyqt5 python-rospkg qt-dotgraph rosgraph rosgraph-msgs roslib rosnode rospy rosservice rostopic rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_graph-release/archive/release/melodic/rqt_graph/0.4.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "52356e25a50179dcef877b68ead560d8"
SRC_URI[sha256sum] = "42392c916b12e8c40f044840f42090981ae5bdf5925bcaccd716416e2aace427"

S = "${WORKDIR}/rqt_graph-release-release-melodic-rqt_graph-0.4.10-0"

inherit catkin
