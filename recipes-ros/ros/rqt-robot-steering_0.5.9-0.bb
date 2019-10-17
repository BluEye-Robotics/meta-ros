DESCRIPTION = "rqt_robot_steering provides a GUI plugin for steering a robot using Twist messages."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs python3-pyqt5 python3-rospkg rostopic rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "geometry-msgs python3-pyqt5 python3-rospkg rostopic rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_robot_steering-release/archive/release/melodic/rqt_robot_steering/0.5.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "300b980b8ef84b20db9d2af0348583d7"
SRC_URI[sha256sum] = "88c3867ac42fc3ad6533f1fabc58ab169a1f3d4cbe9ae0e165edae28ad5b4df4"

S = "${WORKDIR}/rqt_robot_steering-release-release-melodic-rqt_robot_steering-0.5.9-0"

inherit catkin
