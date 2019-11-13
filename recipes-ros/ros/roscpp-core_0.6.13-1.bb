DESCRIPTION = "Underlying data libraries for roscpp messages."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common roscpp-serialization roscpp-traits rostime"

RDEPENDS_${PN} = "cpp-common roscpp-serialization roscpp-traits rostime"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_core/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b57294918909b62314d12f46cc5a1ca3"
SRC_URI[sha256sum] = "34802c1855568443ecadfde7ccaa2e3616101035de9730249804d7acfdfc2046"

S = "${WORKDIR}/roscpp_core-release-release-melodic-roscpp_core-0.6.13-1"

inherit catkin
