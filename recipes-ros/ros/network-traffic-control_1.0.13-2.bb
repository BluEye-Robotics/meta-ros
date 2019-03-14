DESCRIPTION = "A ROS node that allows control of network emulation parameters such as bandwidth, loss and latency for a Linux network interface."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy dynamic-reconfigure rospy dynamic-reconfigure"

RDEPENDS_${PN} = "rospy dynamic-reconfigure"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_traffic_control/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11f7202bd71c62da1151b517f91e8428"
SRC_URI[sha256sum] = "a6ab6e3990f79606e3b67d8e1ee877c85a13469f3fcfc51faa321d79dfceafe1"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_traffic_control-1.0.13-2"

inherit catkin
