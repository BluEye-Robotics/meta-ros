DESCRIPTION = "roscpp_traits contains the message traits code as described in"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common rostime"

RDEPENDS_${PN} = "cpp-common rostime"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_traits/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6f5444b38c023cc813e7b62fb77a35f3"
SRC_URI[sha256sum] = "052831da29842d93c6ab003a11eb6f1ba89849302bac6dd4c232471c1db5fd07"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-roscpp_traits-0.6.12-0"

inherit catkin
