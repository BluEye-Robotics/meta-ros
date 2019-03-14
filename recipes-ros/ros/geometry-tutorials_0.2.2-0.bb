DESCRIPTION = "Metapackage of geometry tutorials ROS."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "turtle-tf turtle-tf2"

RDEPENDS_${PN} = "turtle-tf turtle-tf2"

SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/melodic/geometry_tutorials/0.2.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e7d71d342b1c1df6a306d237fd0f493b"
SRC_URI[sha256sum] = "681b5bd03623bc5832921eeb3d314a4f8d9dfbf05f7f48fb48adf327bfc4e2ea"

S = "${WORKDIR}/geometry_tutorials-release-release-melodic-geometry_tutorials-0.2.2-0"

inherit catkin
