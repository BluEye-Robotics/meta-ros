DESCRIPTION = "rospy is a pure Python client library for ROS. The rospy client API enables Python programmers to quickly interface with ROS"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genpy python-numpy python-rospkg python-pyyaml roscpp rosgraph rosgraph-msgs roslib std-msgs"

RDEPENDS_${PN} = "genpy python-numpy python-rospkg python-pyyaml roscpp rosgraph rosgraph-msgs roslib std-msgs"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rospy/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b5027baecfc599fce9d2c1e399b8169a"
SRC_URI[sha256sum] = "114c5f35bb368343f3a6b8f58374369344bb4ec8aae377ba33fca2ada0a7c07f"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rospy"

inherit catkin
