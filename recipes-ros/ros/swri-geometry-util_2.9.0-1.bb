DESCRIPTION = "swri_geometry_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules cv-bridge libeigen libgeos++-dev roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_geometry_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "213c33e948013fb2d3504b8a97a4a2e9"
SRC_URI[sha256sum] = "435db7796635dfc1e7aefd7d0ec0ee8aa3f91242d4c58228bc2d474c911f23af"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_geometry_util-2.9.0-1"

inherit catkin
