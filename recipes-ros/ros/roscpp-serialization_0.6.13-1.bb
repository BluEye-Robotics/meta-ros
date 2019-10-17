DESCRIPTION = "roscpp_serialization contains the code for serialization as described in"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common roscpp-traits rostime cpp-common roscpp-traits rostime"

RDEPENDS_${PN} = "cpp-common roscpp-traits rostime"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_serialization/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "db54a4b1570302a3e2c09839f61ea422"
SRC_URI[sha256sum] = "4450780fd6d678d7df503b13751fa15edf9287c6b860db822f43f4530b27773f"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-roscpp_serialization-0.6.13-1"

inherit catkin
