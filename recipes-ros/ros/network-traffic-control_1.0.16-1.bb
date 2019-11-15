DESCRIPTION = "A ROS node that allows control of network emulation parameters such as bandwidth, loss and latency for a Linux network interface."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy dynamic-reconfigure rospy dynamic-reconfigure"

RDEPENDS_${PN} = "rospy dynamic-reconfigure"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_traffic_control/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b10fe99f40e09f93127f9548ef8a0433"
SRC_URI[sha256sum] = "9d8832fc6ede4a2a054979e185c34e60452bb6757ed942bb907b622127d62dc7"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_traffic_control-1.0.16-1"

inherit catkin
