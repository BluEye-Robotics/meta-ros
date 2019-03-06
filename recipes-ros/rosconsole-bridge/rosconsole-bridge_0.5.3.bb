DESCRIPTION = "Pipes console_bridge output to rosconsole/rosout when console_bridge is used in a ROS-dependent package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole console-bridge"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4a6410d29341b870f433b64ada583c8b"
SRC_URI[sha256sum] = "e2aca7171b599a65c630e0be199cc642f7bfde266f58a34501def4644ec52fb1"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
