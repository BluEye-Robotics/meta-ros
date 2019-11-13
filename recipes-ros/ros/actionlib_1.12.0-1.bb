DESCRIPTION = "The actionlib stack provides a standardized interface for interfacing with preemptable tasks. Examples of this include moving the base to a target location, performing a laser scan and returning the resulting point cloud, detecting the handle of a door, etc."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib-msgs boost roscpp rospy rostest std-msgs"

RDEPENDS_${PN} = "message-runtime  roslib rostopic"

SRC_URI = "https://github.com/ros-gbp/actionlib-release/archive/release/melodic/actionlib/1.12.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61f153e33a25b8db5023ffa760e47095"
SRC_URI[sha256sum] = "cf5019b5b23a1aa16c1ad5afc47ce10630a512cdc621c926bc1920803dac9ca5"

S = "${WORKDIR}/actionlib-release-release-melodic-actionlib-1.12.0-1"

inherit catkin
