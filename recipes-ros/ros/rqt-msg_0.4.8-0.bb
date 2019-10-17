DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types. Note that the msgs available through this plugin is the ones that are stored on your machine, not on the ROS core your rqt instance connects to."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-rospkg python3-pyqt5 roslib rosmsg rospy rqt-gui rqt-gui-py rqt-py-common rqt-console"

RDEPENDS_${PN} = "python3-rospkg python3-pyqt5 roslib rosmsg rospy rqt-gui rqt-gui-py rqt-py-common rqt-console"

SRC_URI = "https://github.com/ros-gbp/rqt_msg-release/archive/release/melodic/rqt_msg/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f187230eed29c0be3ab8c297a8bfb8c"
SRC_URI[sha256sum] = "ec3e88d3c822856ace98a11ab03950fb0e9390829122b7abfabc863180611630"

S = "${WORKDIR}/rqt_msg-release-release-melodic-rqt_msg-0.4.8-0"

inherit catkin
