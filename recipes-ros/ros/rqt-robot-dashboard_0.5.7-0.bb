DESCRIPTION = "rqt_robot_dashboard provides an infrastructure for building robot dashboard plugins in rqt."
AUTHOR = "Ze'ev Klapow"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs python3-pyqt5 qt-gui rospy rqt-console rqt-gui rqt-gui-py rqt-nav-view rqt-robot-monitor"

RDEPENDS_${PN} = "diagnostic-msgs python3-pyqt5 qt-gui rospy rqt-console rqt-gui rqt-gui-py rqt-nav-view rqt-robot-monitor"

SRC_URI = "https://github.com/ros-gbp/rqt_robot_dashboard-release/archive/release/melodic/rqt_robot_dashboard/0.5.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18fa7cd5e3c9c9a393b99466806cac00"
SRC_URI[sha256sum] = "19eb8bffb5697ef7e7d7bc23cf7cda4e3446e6415a40e53987095b85bb9b8568"

S = "${WORKDIR}/rqt_robot_dashboard-release-release-melodic-rqt_robot_dashboard-0.5.7-0"

inherit catkin
