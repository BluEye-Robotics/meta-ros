DESCRIPTION = "Controllers to operate the digital output of the motor controller boards and the projector board. This package has not been reviewed and should be considered unstable."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-controller-interface realtime-tools roscpp diagnostic-msgs pluginlib std-msgs message-generation libtool rospy pr2-controller-interface realtime-tools roscpp diagnostic-msgs pluginlib message-runtime std-msgs libtool"

RDEPENDS_${PN} = "rospy pr2-controller-interface realtime-tools roscpp diagnostic-msgs pluginlib message-runtime std-msgs libtool"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/ethercat_trigger_controllers/1.10.17-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6670c14a661e4e3fec5fca772313e267"
SRC_URI[sha256sum] = "d3630e54d263a3f14802f4b62710e4da4f21e78b6415d70fbd3b6a0b16b0ca5c"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-ethercat_trigger_controllers-1.10.17-1"

inherit catkin
