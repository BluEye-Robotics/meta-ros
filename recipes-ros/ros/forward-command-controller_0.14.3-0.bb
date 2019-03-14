DESCRIPTION = "forward_command_controller"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface hardware-interface std-msgs realtime-tools"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/forward_command_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6786ba63d5c634247b622593a2ff8a0a"
SRC_URI[sha256sum] = "033b65a8cfaadbc143f33b8ef6e9a66a2347bb95a91f651ff2a3121d0bc71a86"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-forward_command_controller-0.14.3-0"

inherit catkin
