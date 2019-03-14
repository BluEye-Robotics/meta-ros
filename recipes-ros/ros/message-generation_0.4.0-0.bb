DESCRIPTION = "Package modeling the build-time dependencies for generating language bindings of messages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gencpp geneus gennodejs genlisp genmsg genpy"

RDEPENDS_${PN} = "gencpp geneus gennodejs genlisp genmsg genpy"

SRC_URI = "https://github.com/ros-gbp/message_generation-release/archive/release/kinetic/message_generation/0.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b1b95f7522ddfeec31a9edbce536a76c"
SRC_URI[sha256sum] = "ac76ca0d20dd18e43aa4a13cf7669a3a0849456d57636738d38110f7b321e463"

S = "${WORKDIR}/message_generation-release-release-kinetic-message_generation-0.4.0-0"

inherit catkin
