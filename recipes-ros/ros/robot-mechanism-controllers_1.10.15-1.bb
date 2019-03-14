DESCRIPTION = "Generic Mechanism Controller Library"
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp angles filters tf tf-conversions eigen-conversions pluginlib actionlib std-msgs geometry-msgs diagnostic-msgs trajectory-msgs pr2-controllers-msgs pr2-controller-interface pr2-controller-manager kdl-parser pr2-mechanism-model control-toolbox realtime-tools message-filters control-msgs libtool message-generation rospy roscpp angles filters tf tf-conversions eigen-conversions pluginlib actionlib std-msgs geometry-msgs diagnostic-msgs trajectory-msgs pr2-controllers-msgs pr2-controller-interface pr2-controller-manager kdl-parser pr2-mechanism-model control-toolbox realtime-tools message-filters control-msgs libtool message-runtime"

RDEPENDS_${PN} = "rospy roscpp angles filters tf tf-conversions eigen-conversions pluginlib actionlib std-msgs geometry-msgs diagnostic-msgs trajectory-msgs pr2-controllers-msgs pr2-controller-interface pr2-controller-manager kdl-parser pr2-mechanism-model control-toolbox realtime-tools message-filters control-msgs libtool message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/robot_mechanism_controllers/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c3d7fcb2dc59cb73ec24d4c45a8eb1be"
SRC_URI[sha256sum] = "3edf4bf3c0aec34188fe768259562f3af1e4795c971f6ce581febdd56a186dfd"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-robot_mechanism_controllers-1.10.15-1"

inherit catkin
