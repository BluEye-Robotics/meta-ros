DESCRIPTION = "rqt_robot_monitor displays diagnostics_agg topics messages that are published by"
AUTHOR = "Austin Hendrix"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs python3-pyqt5 python3-rospkg qt-gui qt-gui-py-common rospy rqt-py-common rqt-gui rqt-gui-py rqt-bag"

RDEPENDS_${PN} = "diagnostic-msgs python3-pyqt5 python3-rospkg qt-gui qt-gui-py-common rospy rqt-py-common rqt-gui rqt-gui-py rqt-bag"

SRC_URI = "https://github.com/ros-gbp/rqt_robot_monitor-release/archive/release/melodic/rqt_robot_monitor/0.5.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9db39f189b9149449b334c4ecad5bb8e"
SRC_URI[sha256sum] = "30aa7f05721a5d681de9c27d5b5de3c68d719bdbc2a72748ef2166c972e4e055"

S = "${WORKDIR}/rqt_robot_monitor-release-release-melodic-rqt_robot_monitor-0.5.9-1"

inherit catkin
