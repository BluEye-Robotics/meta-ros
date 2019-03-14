DESCRIPTION = "This rqt plugin ROS package provides easy view of . launch files. User can also start and end node by node that are defined in those files."
AUTHOR = "Isaac Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rqt-py-common python-pyqt5 roslaunch rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"

RDEPENDS_${PN} = "python-pyqt5 roslaunch rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"

SRC_URI = "https://github.com/ros-gbp/rqt_launch-release/archive/release/melodic/rqt_launch/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a3165be8884c5ccac21136c1c441891e"
SRC_URI[sha256sum] = "7aab0c6b78ad90736d40ae6b7ce54048936ef38c0f032858b65a8347b4cbccc8"

S = "${WORKDIR}/rqt_launch-release-release-melodic-rqt_launch-0.4.8-0"

inherit catkin
