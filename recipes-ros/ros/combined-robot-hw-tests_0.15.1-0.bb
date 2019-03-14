DESCRIPTION = "The combined_robot_hw_tests package"
AUTHOR = "Toni Oliver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "combined-robot-hw controller-manager controller-manager-tests hardware-interface roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/combined_robot_hw_tests/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "99c03d2b074dfa69284f00b1d7da2dc6"
SRC_URI[sha256sum] = "df8e558ef4b707ba0691eabdd3dfbc72bfdb050c3e94c87e0cf69675ba2443ff"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-combined_robot_hw_tests-0.15.1-0"

inherit catkin
