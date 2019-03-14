DESCRIPTION = "roscpp_serialization contains the code for serialization as described in"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common roscpp-traits rostime cpp-common roscpp-traits rostime"

RDEPENDS_${PN} = "cpp-common roscpp-traits rostime"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_serialization/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a9ddcfa3b0f9820e4289356f6411de64"
SRC_URI[sha256sum] = "ba4ea435dc1d1680f6242b142f06376785ca3abeed71862c23bd6dd0220833e5"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-roscpp_serialization-0.6.12-0"

inherit catkin
