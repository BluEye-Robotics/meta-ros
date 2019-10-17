DESCRIPTION = "roscpp_traits contains the message traits code as described in"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common rostime"

RDEPENDS_${PN} = "cpp-common rostime"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_traits/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2c9b4127ed1d1eb35e88ba075816725c"
SRC_URI[sha256sum] = "f526ea6a1fca995dc3db1a1c76922658f9cf932a569d6ab5c5c166a64b026eac"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-roscpp_traits-0.6.13-1"

inherit catkin
