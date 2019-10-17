DESCRIPTION = "The pr2_gripper_action provides an action interface for using the gripper. Users can specify what position to move to (while limiting the force) and the action will report success when the position is reached or failure when the gripper cannot move any longer."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib-msgs actionlib pr2-mechanism-controllers robot-mechanism-controllers pr2-controllers-msgs pr2-mechanism-model roscpp actionlib-msgs actionlib pr2-mechanism-controllers robot-mechanism-controllers pr2-controllers-msgs pr2-mechanism-model"

RDEPENDS_${PN} = "roscpp actionlib-msgs actionlib pr2-mechanism-controllers robot-mechanism-controllers pr2-controllers-msgs pr2-mechanism-model"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_gripper_action/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "47b31045b0329719004eca97e2ee767e"
SRC_URI[sha256sum] = "c2af780c2458ba7a28fcef738f8b231d59367ee9e82aea74f9fe4802216b6402"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_gripper_action-1.10.15-1"

inherit catkin
