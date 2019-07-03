DESCRIPTION = "ml_classifiers"
AUTHOR = "Scott Niekum"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation rosidl-default-generators libeigen pluginlib std-msgs roscpp roslib rclcpp"

RDEPENDS_${PN} = "message-runtime rosidl-default-runtime"

SRC_URI = "https://github.com/astuff/ml_classifiers-release/archive/release/melodic/ml_classifiers/1.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c41a0e1479d5256e3022717931a50449"
SRC_URI[sha256sum] = "77588596b459e29cb22098164289c3b74e0a6326d372c99ce6025a422a21c564"

S = "${WORKDIR}/ml_classifiers-release-release-melodic-ml_classifiers-1.0.1-1"

inherit catkin
