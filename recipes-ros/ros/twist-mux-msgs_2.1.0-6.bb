DESCRIPTION = "The twist_mux msgs and actions package"
AUTHOR = "Enrique Fernandez"
SECTION = "devel"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=6bc0e2b80b41b84c8240cea714dea709"

DEPENDS = "message-generation actionlib actionlib-msgs message-runtime actionlib actionlib-msgs"

RDEPENDS_${PN} = "message-runtime actionlib actionlib-msgs"

SRC_URI = "https://github.com/ros-gbp/twist_mux_msgs-release/archive/release/melodic/twist_mux_msgs/2.1.0-6.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dfe945d19d6a8b0d8883f2a02869788e"
SRC_URI[sha256sum] = "521a28a3dcc722a2eac2208e66f7f511a2010c3fda6e0b81fe45548c3ead692a"

S = "${WORKDIR}/twist_mux_msgs-release-release-melodic-twist_mux_msgs-2.1.0-6"

inherit catkin
