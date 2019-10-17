DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs python3-cairo python3-imaging rosbag roslib rospy rqt-bag rqt-gui rqt-gui-py rqt-plot sensor-msgs std-msgs"

RDEPENDS_${PN} = "geometry-msgs python3-cairo python3-imaging rosbag roslib rospy rqt-bag rqt-gui rqt-gui-py rqt-plot sensor-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/melodic/rqt_bag_plugins/0.4.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1ab3e4fe92a70359ab37b0e3734941f1"
SRC_URI[sha256sum] = "03951bd0c5ee306b14adec3e97a71804e35aed94d2d7a135c0cea5fb58cf87c7"

ROS_SPN = "rqt_bag"
S = "${WORKDIR}/rqt_bag-release-release-melodic-rqt_bag_plugins-0.4.12-0"

inherit catkin
