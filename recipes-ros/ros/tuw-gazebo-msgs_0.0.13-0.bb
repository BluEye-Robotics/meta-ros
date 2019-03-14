DESCRIPTION = "Message and service data structures."
AUTHOR = "George Todoran"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy geometry-msgs sensor-msgs trajectory-msgs std-msgs std-srvs message-generation"

RDEPENDS_${PN} = "roscpp rospy geometry-msgs sensor-msgs trajectory-msgs std-msgs std-srvs message-runtime"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_gazebo_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eea4223ac9e2b128fb6c6884eae59c46"
SRC_URI[sha256sum] = "126d0a9d1083f1d6e1c05b617f46f4c00e72dbd5a26a4dfa16490465d7dcc181"

ROS_SPN = "tuw_msgs"
S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_gazebo_msgs-0.0.13-0"

inherit catkin
