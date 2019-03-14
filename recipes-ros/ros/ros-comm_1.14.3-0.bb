DESCRIPTION = "ROS communications-related packages, including core client libraries (roscpp, rospy) and graph introspection tools (rostopic, rosnode, rosservice, rosparam)."
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy rosgraph-msgs std-srvs ros rosbag rosconsole rosgraph roslaunch  rosmaster rosmsg rosnode rosout rosparam rosservice rostest rostopic topic-tools message-filters roswtf xmlrpcpp"

RDEPENDS_${PN} = "roscpp rospy rosgraph-msgs std-srvs ros rosbag rosconsole rosgraph roslaunch  rosmaster rosmsg rosnode rosout rosparam rosservice rostest rostopic topic-tools message-filters roswtf xmlrpcpp"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/ros_comm/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "836f59923b2fdeafa41604ed7380f167"
SRC_URI[sha256sum] = "e50bee6dd4635917c0599d4e97199ac10dbb1e1a8efbb541889076bf10473198"

S = "${WORKDIR}/ros_comm-release-release-melodic-ros_comm-1.14.3-0"

inherit catkin
