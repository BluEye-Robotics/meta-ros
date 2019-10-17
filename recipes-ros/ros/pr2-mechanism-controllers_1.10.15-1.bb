DESCRIPTION = "The pr2_mechanism_controllers package contains realtime controllers that are meant for specific mechanisms of the PR2."
AUTHOR = "Sachin Chita"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs geometry-msgs pr2-mechanism-msgs nav-msgs pr2-msgs visualization-msgs diagnostic-msgs pr2-controller-interface roscpp pr2-controllers-msgs pr2-mechanism-model realtime-tools robot-mechanism-controllers rospy pluginlib rosconsole tf angles control-toolbox filters diagnostic-updater message-generation std-msgs geometry-msgs pr2-mechanism-msgs nav-msgs pr2-msgs visualization-msgs diagnostic-msgs pr2-controller-interface roscpp pr2-controllers-msgs pr2-mechanism-model realtime-tools robot-mechanism-controllers rospy pluginlib rosconsole tf angles control-toolbox filters diagnostic-updater message-runtime"

RDEPENDS_${PN} = "std-msgs geometry-msgs pr2-mechanism-msgs nav-msgs pr2-msgs visualization-msgs diagnostic-msgs pr2-controller-interface roscpp pr2-controllers-msgs pr2-mechanism-model realtime-tools robot-mechanism-controllers rospy pluginlib rosconsole tf angles control-toolbox filters diagnostic-updater message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_mechanism_controllers/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3bea1fe2ebcc1d8af16f95b4b47fcc38"
SRC_URI[sha256sum] = "890a0f35fb6cc047e87cc265a82e5e54988d7095db41b53f4182590b434ed6ec"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_mechanism_controllers-1.10.15-1"

inherit catkin
