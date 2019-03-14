DESCRIPTION = "This stack aims to bring the common tools and algorithms needed to develop navigation algorithms, in particular slam. It does not focus on the end-point solution, rather the tools needed to create a variety of end-point solutions."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-mobile-robot"

RDEPENDS_${PN} = "ecl-mobile-robot"

SRC_URI = "https://github.com/yujinrobot-release/ecl_navigation-release/archive/release/melodic/ecl_navigation/0.60.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "551a5aa47684bb7ef0d5b8cde262252c"
SRC_URI[sha256sum] = "1d3e834b6aa0b70617f25fc03c9c7f275e5280ed6a75570483b0db48ecd5b32d"

S = "${WORKDIR}/ecl_navigation-release-release-melodic-ecl_navigation-0.60.3-0"

inherit catkin
