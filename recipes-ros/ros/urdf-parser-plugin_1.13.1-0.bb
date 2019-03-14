DESCRIPTION = "This package contains a C++ base class for URDF parsers."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdfdom-headers urdfdom-headers"

RDEPENDS_${PN} = "urdfdom-headers"

SRC_URI = "https://github.com/ros-gbp/urdf-release/archive/release/melodic/urdf_parser_plugin/1.13.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "58fe71decfe877316057af76fb3819da"
SRC_URI[sha256sum] = "7031baf19ed479dcc35455fc5090a740ccc28592c8fd565154ea6556aa80f747"

ROS_SPN = "urdf"
S = "${WORKDIR}/urdf-release-release-melodic-urdf_parser_plugin-1.13.1-0"

inherit catkin
