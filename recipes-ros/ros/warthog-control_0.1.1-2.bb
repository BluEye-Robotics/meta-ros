DESCRIPTION = "Controllers for Warthog"
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch controller-manager interactive-marker-twist-server diff-drive-controller joint-state-controller joy robot-localization teleop-twist-joy topic-tools rosserial-server twist-mux"

RDEPENDS_${PN} = "controller-manager interactive-marker-twist-server diff-drive-controller joint-state-controller joy robot-localization teleop-twist-joy topic-tools rosserial-server twist-mux"

SRC_URI = "https://github.com/clearpath-gbp/warthog-release/archive/release/melodic/warthog_control/0.1.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18e2e1c0967d4ecc0e96f883ff26ecfe"
SRC_URI[sha256sum] = "e370cf7695d20f5c2d9c20146c481c11536d54d69cfe4147aadbe0e75243e314"

ROS_SPN = "warthog"
S = "${WORKDIR}/warthog-release-release-melodic-warthog_control-0.1.1-2"

inherit catkin
