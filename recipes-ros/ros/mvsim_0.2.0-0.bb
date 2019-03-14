DESCRIPTION = "Node for the "multivehicle simulator" framework."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 roscpp std-msgs dynamic-reconfigure mrpt-bridge sensor-msgs visualization-msgs nav-msgs tf message-generation message-runtime"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ual-arm-ros-pkg-release/mvsim-release/archive/release/melodic/mvsim/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2395ce47c5b08a10bebb221a808a9907"
SRC_URI[sha256sum] = "788c6a3c796e9d0cdf65bbc9793a35edfe6bc685ecfa6521bf0be1dc024e1dce"

S = "${WORKDIR}/mvsim-release-release-melodic-mvsim-0.2.0-0"

inherit catkin
