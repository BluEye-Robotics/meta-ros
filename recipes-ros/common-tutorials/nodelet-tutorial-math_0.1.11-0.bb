DESCRIPTION = "nodelet_tutorial_math ROS package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"
SRC_URI[md5sum] = "5325b0a3d645201269d3f51a1c4641b4"
SRC_URI[sha256sum] = "399778f44a140cd9fd5b0ed41b8c88408803791a64b0c3d006bca4b174b1669f"

DEPENDS = "roscpp nodelet std-msgs"

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_BPN}-${PV}"

require common-tutorials.inc
