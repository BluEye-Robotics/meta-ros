DESCRIPTION = "The core rosbridge package, repsonsible for interpreting JSON andperforming the appropriate ROS action, like subscribe, publish, call service, and interact with params."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs python-imaging geometry-msgs message-generation python-pymongo"

RDEPENDS_${PN} = "rospy roscpp rosgraph rosservice rostopic std-msgs python-imaging geometry-msgs message-runtime python-bson"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_library/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "85f9844ee5f82257e48a69387fe8bab4"
SRC_URI[sha256sum] = "7e1d6306830260a6eb609ab2e70f84b75127b9080047fd5f038de9ef9a394e01"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_library-0.11.1-1"

inherit catkin
