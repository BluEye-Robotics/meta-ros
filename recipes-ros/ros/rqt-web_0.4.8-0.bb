DESCRIPTION = "rqt_web is a simple web content viewer for rqt. Users can show web content in Qt-based window by specifying its URL."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-pyqt5 python3-rospkg qt-gui rospy rqt-gui rqt-gui-py webkit-dependency"

RDEPENDS_${PN} = "python3-pyqt5 python3-rospkg qt-gui rospy rqt-gui rqt-gui-py webkit-dependency"

SRC_URI = "https://github.com/ros-gbp/rqt_web-release/archive/release/melodic/rqt_web/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e030a570e7434f7499ab61c064e53a76"
SRC_URI[sha256sum] = "3192e2e64f268d79b93d505bc475aa1f39009e75f645d294934d55c2b0b27303"

S = "${WORKDIR}/rqt_web-release-release-melodic-rqt_web-0.4.8-0"

inherit catkin
