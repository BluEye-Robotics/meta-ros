DESCRIPTION = "rqt_py_console is a Python GUI plugin providing an interactive Python console."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-pyqt5 python3-rospkg qt-gui qt-gui-py-common rospy rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "python3-pyqt5 python3-rospkg qt-gui qt-gui-py-common rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_py_console-release/archive/release/melodic/rqt_py_console/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "977e5568ff9ccde7ed0e2c355ba8998b"
SRC_URI[sha256sum] = "0c5714fce4f464fa175e42a7c8fc0ced483fdcfbd90cf4c8584f40b3cf208242"

S = "${WORKDIR}/rqt_py_console-release-release-melodic-rqt_py_console-0.4.8-0"

inherit catkin
