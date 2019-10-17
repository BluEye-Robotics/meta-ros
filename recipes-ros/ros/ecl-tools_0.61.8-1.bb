DESCRIPTION = "Tools and utilities for ecl development."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build"

RDEPENDS_${PN} = "ecl-license ecl-build"

SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/melodic/ecl_tools/0.61.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "496ab18af4b4496b7124fca9c6284fad"
SRC_URI[sha256sum] = "5ea1eb5c7d3c86b08acadffe264deee68367494eebcfb9b95c0e091ed152e8b5"

S = "${WORKDIR}/ecl_tools-release-release-melodic-ecl_tools-0.61.8-1"

inherit catkin
