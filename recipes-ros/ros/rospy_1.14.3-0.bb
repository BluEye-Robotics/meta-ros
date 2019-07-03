DESCRIPTION = "rospy is a pure Python client library for ROS. The rospy client API enables Python programmers to quickly interface with ROS"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genpy python-numpy python-rospkg python-pyyaml roscpp rosgraph rosgraph-msgs roslib std-msgs"

RDEPENDS_${PN} = "genpy python-numpy python-rospkg python-pyyaml roscpp rosgraph rosgraph-msgs roslib std-msgs"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rospy/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d2dcef8e41fb758b6ef06eee70e292f6"
SRC_URI[sha256sum] = "3dbd699e3d8cea6b5fc18d98d184a1aedb4171a0eca3cd9ba280f320b3607468"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rospy-1.14.3-0"

inherit catkin
