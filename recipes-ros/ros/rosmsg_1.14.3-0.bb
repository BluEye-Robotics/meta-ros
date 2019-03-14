DESCRIPTION = "rosmsg contains two command-line tools:"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin genmsg genpy python-rospkg rosbag roslib"

RDEPENDS_${PN} = "catkin genmsg genpy python-rospkg rosbag roslib"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosmsg/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fd60582e36ad9ed2a864b50a515f58a"
SRC_URI[sha256sum] = "d6b76ae3f2df2b92e423f03b57ddd325f928e6d16b1fbcac2939fd173ce3195d"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosmsg-1.14.3-0"

inherit catkin
