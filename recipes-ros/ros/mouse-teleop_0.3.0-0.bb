DESCRIPTION = "A mouse teleop tool for holonomic mobile robots."
AUTHOR = "Enrique Fernandez"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy geometry-msgs python-numpy"

RDEPENDS_${PN} = "rospy geometry-msgs python-numpy"

SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/melodic/mouse_teleop/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eb6f85045b8e99320b6af07e15fdf0cf"
SRC_URI[sha256sum] = "ccf8af493ba91d2a7dee432444454286025cc9bafb30105a1e5ec46ab744cb05"

ROS_SPN = "teleop_tools"
S = "${WORKDIR}/teleop_tools-release-release-melodic-mouse_teleop-0.3.0-0"

inherit catkin
