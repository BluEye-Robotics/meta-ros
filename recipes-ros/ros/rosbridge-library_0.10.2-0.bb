DESCRIPTION = "The core rosbridge package, repsonsible for interpreting JSON andperforming the appropriate ROS action, like subscribe, publish, call service, and interact with params."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs python-imaging geometry-msgs message-generation python-pymongo"

RDEPENDS_${PN} = "rospy roscpp rosgraph rosservice rostopic std-msgs python-imaging geometry-msgs message-runtime python-bson"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_library/0.10.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8be53b705bd507b3d8c945dbd924335f"
SRC_URI[sha256sum] = "ddf75d5958ac208aefa08af76b0bea826739cc965e4f8506c4cad2a2be9941da"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_library-0.10.2-0"

inherit catkin
