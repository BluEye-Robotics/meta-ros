DESCRIPTION = "RQT plugin for monitoring ROS processes."
AUTHOR = "Dan Lazewatsky"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-psutil python3-pyqt5 rospy rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "python3-psutil python3-pyqt5 rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_top-release/archive/release/melodic/rqt_top/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b8cbf54db8b9359a53946b42ef9e13c1"
SRC_URI[sha256sum] = "06a64dcb66e010ec7fa6e474dcd0b50efac71516ecb6a247c38652d309ee7c8a"

S = "${WORKDIR}/rqt_top-release-release-melodic-rqt_top-0.4.8-0"

inherit catkin
