DESCRIPTION = "Tools for directing, throttling, selecting, and otherwise messing with ROS topics at a meta level. None of the programs in this package actually know about the topics whose streams they are altering; instead, these tools deal with messages as generic binary blobs. This means they can be applied to any ROS topic."
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common message-generation rosconsole roscpp rostest rostime rosunit std-msgs xmlrpcpp message-runtime rosconsole roscpp rostime std-msgs xmlrpcpp"

RDEPENDS_${PN} = "message-runtime rosconsole roscpp rostime std-msgs xmlrpcpp"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/topic_tools/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d75414e8fc4dc2d0293010c5963d938d"
SRC_URI[sha256sum] = "11737ac9aee93efcde7615891fd0342a8151e09b03435b1a173ddedef6c91f18"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-topic_tools-1.14.3-0"

inherit catkin
