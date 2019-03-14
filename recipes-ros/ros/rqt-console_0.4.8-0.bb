DESCRIPTION = "rqt_console provides a GUI plugin for displaying and filtering ROS messages."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg python-pyqt5 roslib rospy rqt-gui rqt-gui-py rqt-logger-level rqt-py-common"

RDEPENDS_${PN} = "python-rospkg python-pyqt5 roslib rospy rqt-gui rqt-gui-py rqt-logger-level rqt-py-common"

SRC_URI = "https://github.com/ros-gbp/rqt_console-release/archive/release/melodic/rqt_console/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e56720fc75f763a061ec5ce726369ced"
SRC_URI[sha256sum] = "bd66d6c711910fb8db8804b403bf5cedcce83ecfc82eaa4c12afb5e035a6eeb3"

S = "${WORKDIR}/rqt_console-release-release-melodic-rqt_console-0.4.8-0"

inherit catkin
