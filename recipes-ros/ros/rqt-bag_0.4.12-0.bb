DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-pyqt5 python3-rospkg rosbag rosgraph-msgs roslib rosnode rospy rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "python3-pyqt5 python3-rospkg rosbag rosgraph-msgs roslib rosnode rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/melodic/rqt_bag/0.4.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "12176a3c9463b41c829fa96898f80ea1"
SRC_URI[sha256sum] = "53a48d67f5cedf54b58b26b33350958952bac0c27f38160918c6ba0f4aa5014f"

S = "${WORKDIR}/rqt_bag-release-release-melodic-rqt_bag-0.4.12-0"

inherit catkin
