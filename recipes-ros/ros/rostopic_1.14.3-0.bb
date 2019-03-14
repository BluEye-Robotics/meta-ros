DESCRIPTION = "rostopic contains the rostopic command-line tool for displaying debug information about ROS"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest genpy rosbag rospy"

RDEPENDS_${PN} = "genpy rosbag rospy"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rostopic/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "26df9d3073fd099eb473ef079a5ee3d0"
SRC_URI[sha256sum] = "0327ddd98b2b5aea960318ee4548726994d033f110d1016e53399a74ec6043de"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rostopic-1.14.3-0"

inherit catkin
