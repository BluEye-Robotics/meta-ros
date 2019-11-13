DESCRIPTION = "Generic Mechanism Controller Library"
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp angles filters tf tf-conversions eigen-conversions pluginlib actionlib std-msgs geometry-msgs diagnostic-msgs trajectory-msgs pr2-controllers-msgs pr2-controller-interface pr2-controller-manager kdl-parser pr2-mechanism-model control-toolbox realtime-tools message-filters control-msgs libtool message-generation rospy roscpp angles filters tf tf-conversions eigen-conversions pluginlib actionlib std-msgs geometry-msgs diagnostic-msgs trajectory-msgs pr2-controllers-msgs pr2-controller-interface pr2-controller-manager kdl-parser pr2-mechanism-model control-toolbox realtime-tools message-filters control-msgs libtool message-runtime"

RDEPENDS_${PN} = "rospy roscpp angles filters tf tf-conversions eigen-conversions pluginlib actionlib std-msgs geometry-msgs diagnostic-msgs trajectory-msgs pr2-controllers-msgs pr2-controller-interface pr2-controller-manager kdl-parser pr2-mechanism-model control-toolbox realtime-tools message-filters control-msgs libtool message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/robot_mechanism_controllers/1.10.17-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ecf050fa2f53840c79a01973cca5aae2"
SRC_URI[sha256sum] = "9872fd46f89691f6d95342683735e9963d8f170889c5ccc2f2e9a01d437e3800"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-robot_mechanism_controllers-1.10.17-1"

inherit catkin
