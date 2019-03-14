DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
AUTHOR = "Melonee Wise"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules message-generation control-msgs std-msgs roscpp dynamic-reconfigure libtinyxml realtime-tools"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/control_toolbox-release/archive/release/melodic/control_toolbox/1.17.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "53934c060496938b94a56ad5f367c979"
SRC_URI[sha256sum] = "87d87fd3110630b61fba232464add3e10dca4f7e6a080cf4900827cccf711c56"

S = "${WORKDIR}/control_toolbox-release-release-melodic-control_toolbox-1.17.0-0"

inherit catkin
