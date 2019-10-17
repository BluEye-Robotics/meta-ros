DESCRIPTION = "The pr2_calibration_controllers package contains the controllers used to bring all the joints in the PR2 to a calibrated state."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs pr2-controller-interface roscpp pr2-mechanism-model realtime-tools robot-mechanism-controllers pr2-mechanism-controllers pluginlib std-msgs pr2-controller-interface roscpp pr2-mechanism-model realtime-tools robot-mechanism-controllers pr2-mechanism-controllers pluginlib"

RDEPENDS_${PN} = "std-msgs pr2-controller-interface roscpp pr2-mechanism-model realtime-tools robot-mechanism-controllers pr2-mechanism-controllers pluginlib"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_calibration_controllers/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd11dc8e027665a041aef92f1a907f2d"
SRC_URI[sha256sum] = "9ea80cb06d1d5a1c20b6387b178bcc653d63d66d7acce59de628c25d944a9cf3"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_calibration_controllers-1.10.15-1"

inherit catkin
