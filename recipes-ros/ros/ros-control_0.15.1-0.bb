DESCRIPTION = "A set of packages that include controller interfaces, controller managers, transmissions and hardware_interfaces."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "joint-limits-interface transmission-interface realtime-tools controller-manager controller-interface hardware-interface controller-manager-tests controller-manager-msgs combined-robot-hw combined-robot-hw-tests"

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/ros_control/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "af9f4b2b19bf36bbf5e142045cac4801"
SRC_URI[sha256sum] = "58bf82c63707b76b7d6752df3afd2b4fe369fc95260431e56a8cb7068a57f76a"

S = "${WORKDIR}/ros_control-release-release-melodic-ros_control-0.15.1-0"

inherit catkin
