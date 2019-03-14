DESCRIPTION = "position_controllers"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface forward-command-controller"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/position_controllers/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6ff8e0b4ae34b6a9acf45c6244544874"
SRC_URI[sha256sum] = "91aa18fc5a7c90ec7af738804d0025c85b3961bcefceba3bec52751fb16c7f1d"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-position_controllers-0.14.3-0"

inherit catkin
