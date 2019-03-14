DESCRIPTION = "The actionlib stack provides a standardized interface for interfacing with preemptable tasks. Examples of this include moving the base to a target location, performing a laser scan and returning the resulting point cloud, detecting the handle of a door, etc."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib-msgs boost roscpp rospy rostest std-msgs"

RDEPENDS_${PN} = "message-runtime  roslib rostopic"

SRC_URI = "https://github.com/ros-gbp/actionlib-release/archive/release/melodic/actionlib/1.11.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d6cfeae887924722542b9cca12a971fa"
SRC_URI[sha256sum] = "7b6d1fba25d1f4de6d3b87d82cac1aae73a88bc4811e7e55626f9b21db34f99c"

S = "${WORKDIR}/actionlib-release-release-melodic-actionlib-1.11.13-0"

inherit catkin
