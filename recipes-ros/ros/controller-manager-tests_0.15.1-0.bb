DESCRIPTION = "controller_manager_tests"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-manager controller-interface controller-manager controller-interface"

RDEPENDS_${PN} = "controller-manager controller-interface"

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/controller_manager_tests/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "81be415003faa8d1a52d16274dac18e4"
SRC_URI[sha256sum] = "b43edda9914e25875e06aaace29bf7c78afc68d0cc59da2b77dc7e5783a7b4af"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-controller_manager_tests-0.15.1-0"

inherit catkin
