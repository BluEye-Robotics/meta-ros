DESCRIPTION = "Controllers to operate the digital output of the motor controller boards and the projector board. This package has not been reviewed and should be considered unstable."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-controller-interface realtime-tools roscpp diagnostic-msgs pluginlib std-msgs message-generation libtool rospy pr2-controller-interface realtime-tools roscpp diagnostic-msgs pluginlib message-runtime std-msgs libtool"

RDEPENDS_${PN} = "rospy pr2-controller-interface realtime-tools roscpp diagnostic-msgs pluginlib message-runtime std-msgs libtool"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/ethercat_trigger_controllers/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e7da1ef23ee382ce94a8788cd0a8e605"
SRC_URI[sha256sum] = "a90e00f501dc42e5a50347e28237683a31cd2d959a2fad379d5bda7706de9aed"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-ethercat_trigger_controllers-1.10.15-1"

inherit catkin
