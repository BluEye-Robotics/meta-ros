DESCRIPTION = "rqt_py_common provides common functionality for rqt plugins written in Python. Despite no plugin is provided, this package is part of the rqt_common_plugins repository to keep refactoring generic functionality from these common plugins into this package as easy as possible. Functionality included in this package should cover generic ROS concepts and should not introduce any special dependencies beside "ros_base"."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg std-msgs genpy python3-pyqt5 qt-gui roslib rospy rostopic actionlib rosbag"

RDEPENDS_${PN} = "genpy python3-pyqt5 qt-gui roslib rospy rostopic actionlib rosbag"

SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/melodic/rqt_py_common/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2ed07f15ec938419959dd379f5438d2a"
SRC_URI[sha256sum] = "54fd2fa913483ae10a05f07b58c91b78b3f3cf79f0dfd53544adb1ca1e576123"

ROS_SPN = "rqt"
S = "${WORKDIR}/rqt-release-release-melodic-rqt_py_common-0.5.0-0"

inherit catkin
