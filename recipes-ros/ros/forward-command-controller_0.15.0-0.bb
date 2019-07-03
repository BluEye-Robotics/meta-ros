DESCRIPTION = "forward_command_controller"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface hardware-interface std-msgs realtime-tools"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/forward_command_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "47bc2d4804d915699b6d7cd3050d54db"
SRC_URI[sha256sum] = "811c1ec365f2d1e20a0c2269f4b678683e6b71788a4adc5c64379e3e523c2ab0"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-forward_command_controller-0.15.0-0"

inherit catkin
