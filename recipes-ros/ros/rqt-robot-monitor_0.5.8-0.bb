DESCRIPTION = "rqt_robot_monitor displays diagnostics_agg topics messages that are published by"
AUTHOR = "Austin Hendrix"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs python-pyqt5 python-rospkg qt-gui qt-gui-py-common rospy rqt-py-common rqt-gui rqt-gui-py rqt-bag"

RDEPENDS_${PN} = "diagnostic-msgs python-pyqt5 python-rospkg qt-gui qt-gui-py-common rospy rqt-py-common rqt-gui rqt-gui-py rqt-bag"

SRC_URI = "https://github.com/ros-gbp/rqt_robot_monitor-release/archive/release/melodic/rqt_robot_monitor/0.5.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "27b49b7b3d25aae0b77300effe4d321d"
SRC_URI[sha256sum] = "3f1c272f0f73b0c3f1dc3283e233a183f4a0541ee345408fcb6ac83430bb52a8"

S = "${WORKDIR}/rqt_robot_monitor-release-release-melodic-rqt_robot_monitor-0.5.8-0"

inherit catkin
