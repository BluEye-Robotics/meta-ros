DESCRIPTION = "The core rosbridge package, repsonsible for interpreting JSON andperforming the appropriate ROS action, like subscribe, publish, call service, and interact with params."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs python3-imaging geometry-msgs message-generation python3-pymongo"

RDEPENDS_${PN} = "rospy roscpp rosgraph rosservice rostopic std-msgs python3-imaging geometry-msgs message-runtime python3-bson"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_library/0.11.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "75816268a59756a2ec59c2c65555db5f"
SRC_URI[sha256sum] = "d0c705263ea1b9484983a67d77d2a8f9d13f6974d54076d958731f683e468fa8"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_library-0.11.3-1"

inherit catkin
