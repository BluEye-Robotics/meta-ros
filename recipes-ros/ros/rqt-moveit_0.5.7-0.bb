DESCRIPTION = "An rqt-based tool that assists monitoring tasks for"
AUTHOR = "Isaac Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pyqt5 rosnode rospy rostopic rqt-gui rqt-gui-py rqt-py-common rqt-topic sensor-msgs"

RDEPENDS_${PN} = "python-pyqt5 rosnode rospy rostopic rqt-gui rqt-gui-py rqt-py-common rqt-topic sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/rqt_moveit-release/archive/release/melodic/rqt_moveit/0.5.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a3a14bb70eccd5175c40c910a1e2b3d5"
SRC_URI[sha256sum] = "979c1ec400699c3597ee3bc9044aeab021f3cbb79bdf2edfe7572c0ee7a96f96"

S = "${WORKDIR}/rqt_moveit-release-release-melodic-rqt_moveit-0.5.7-0"

inherit catkin
