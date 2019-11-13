DESCRIPTION = "The fetchit_challenge package"
AUTHOR = "Miguel Angel Rodriguez"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs"

RDEPENDS_${PN} = "effort-controllers gazebo-ros gazebo-ros-control rospy robot-state-publisher controller-manager fetch-gazebo actionlib actionlib-msgs"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetchit_challenge/0.9.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9601d445cd074157d75335586e054dc3"
SRC_URI[sha256sum] = "603d36878e1a24437139fe6bc9542bbd19f197c3bea78c6c977b2231c7abb837"

ROS_SPN = "fetch_gazebo"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetchit_challenge-0.9.2-1"

inherit catkin
