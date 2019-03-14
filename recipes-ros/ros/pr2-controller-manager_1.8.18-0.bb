DESCRIPTION = "The controller manager (CM) package provides the infrastructure to run controllers in a hard realtime loop."
AUTHOR = "Eric Berger berger@willowgarage.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules pr2-hardware-interface pr2-mechanism-model pr2-mechanism-diagnostics pr2-description pr2-controller-interface pr2-mechanism-msgs diagnostic-msgs sensor-msgs realtime-tools roscpp pluginlib rostest pr2-hardware-interface pr2-mechanism-model pr2-mechanism-diagnostics pr2-description pr2-controller-interface pr2-mechanism-msgs diagnostic-msgs sensor-msgs realtime-tools roscpp rospy rosparam pluginlib"

RDEPENDS_${PN} = "pr2-hardware-interface pr2-mechanism-model pr2-mechanism-diagnostics pr2-description pr2-controller-interface pr2-mechanism-msgs diagnostic-msgs sensor-msgs realtime-tools roscpp rospy rosparam pluginlib"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_controller_manager/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6ca7525193660e6a19ddb9e3657e4f28"
SRC_URI[sha256sum] = "b8c00259af30026fbef6c1651f3b95332e5aab3922fbc66ed109515613d68da4"

ROS_SPN = "pr2_mechanism"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_controller_manager-1.8.18-0"

inherit catkin
