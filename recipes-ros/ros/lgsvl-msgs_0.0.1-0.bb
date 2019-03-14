DESCRIPTION = "The lgsvl_msgs package for ground truth data."
AUTHOR = "David Uhm"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs sensor-msgs std-msgs message-runtime geometry-msgs sensor-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime geometry-msgs sensor-msgs std-msgs"

SRC_URI = "https://github.com/lgsvl/lgsvl_msgs-release/archive/release/melodic/lgsvl_msgs/0.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cce51587a06baaa8e50398d0add88f52"
SRC_URI[sha256sum] = "2269c8659cbed4f904a98824cb128ee15b954efeb3b47bdb0152a61e2e69eba6"

S = "${WORKDIR}/lgsvl_msgs-release-release-melodic-lgsvl_msgs-0.0.1-0"

inherit catkin
