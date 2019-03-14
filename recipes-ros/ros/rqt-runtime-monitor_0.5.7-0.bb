DESCRIPTION = "rqt_runtime_monitor provides a GUI plugin viewing DiagnosticsArray messages."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs python-pyqt5 python-rospkg qt-gui rospy rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "diagnostic-msgs python-pyqt5 python-rospkg qt-gui rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_runtime_monitor-release/archive/release/melodic/rqt_runtime_monitor/0.5.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b485d040454a1a3877d4e6a091090aa"
SRC_URI[sha256sum] = "f58958b5649d59fca3022a1771e6a457382744c616835cc65980213ab742fd5c"

S = "${WORKDIR}/rqt_runtime_monitor-release-release-melodic-rqt_runtime_monitor-0.5.7-0"

inherit catkin
