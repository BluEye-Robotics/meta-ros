DESCRIPTION = "The smach_ros package contains extensions for the SMACH library to integrate it tightly with ROS. For example, SMACH-ROS can call ROS services, listen to ROS topics, and integrate with"
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest"

RDEPENDS_${PN} = "rospy rostopic std-msgs std-srvs actionlib actionlib-msgs smach smach-msgs"

SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/melodic/smach_ros/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7d07249b174a41620de0346652091166"
SRC_URI[sha256sum] = "2a6062c9bb60b5cea300784b67e7c977b1cd42bc7117c0d5bea7122eb04d37ed"

ROS_SPN = "executive_smach"
S = "${WORKDIR}/executive_smach-release-release-melodic-smach_ros-2.0.1-0"

inherit catkin
