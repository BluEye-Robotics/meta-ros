DESCRIPTION = "rosservice contains the rosservice command-line tool for listing and querying ROS"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genpy rosgraph roslib rospy rosmsg"

RDEPENDS_${PN} = "genpy rosgraph roslib rospy rosmsg"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosservice/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "73adf9b82462e5a9dd4b60cc5f017bef"
SRC_URI[sha256sum] = "3c702a38cbf823bf15ade07745f11dd6b19af38b936630dbadb3473aea130e36"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosservice-1.14.3-0"

inherit catkin
