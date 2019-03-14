DESCRIPTION = "rqt_logger_level provides a GUI plugin for configuring the logger level of ROS nodes."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pyqt5 python-rospkg rosnode rosservice rospy rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "python-pyqt5 python-rospkg rosnode rosservice rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_logger_level-release/archive/release/melodic/rqt_logger_level/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70bcd3612e1f7575e22ae8dcd191fe57"
SRC_URI[sha256sum] = "c2fcc66a3b20e836aba40218bc745f0112986d329804f3929c275534d907a4b9"

S = "${WORKDIR}/rqt_logger_level-release-release-melodic-rqt_logger_level-0.4.8-0"

inherit catkin
