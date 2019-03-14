DESCRIPTION = "Republishing of Selected TFs"
AUTHOR = "Julius Kammer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs geometry-msgs roscpp tf2-ros tf message-generation actionlib actionlib-msgs geometry-msgs roscpp tf2-ros tf message-runtime"

RDEPENDS_${PN} = "actionlib actionlib-msgs geometry-msgs roscpp tf2-ros tf message-runtime"

SRC_URI = "https://github.com/RobotWebTools-release/tf2_web_republisher-release/archive/release/melodic/tf2_web_republisher/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba3bba001c382c2848f5c3d3d16530f8"
SRC_URI[sha256sum] = "401fcc79bf11e5071e8304b1053bf8afed6f3e91d3df30c0823c87c82b741420"

S = "${WORKDIR}/tf2_web_republisher-release-release-melodic-tf2_web_republisher-0.3.2-0"

inherit catkin
