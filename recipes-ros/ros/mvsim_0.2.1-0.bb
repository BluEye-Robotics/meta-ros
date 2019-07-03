DESCRIPTION = "Node for the "multivehicle simulator" framework."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 roscpp std-msgs dynamic-reconfigure mrpt-bridge sensor-msgs visualization-msgs nav-msgs tf message-generation message-runtime"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ual-arm-ros-pkg-release/mvsim-release/archive/release/melodic/mvsim/0.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7114b3f51d9d10bc5dfa8e52dc56e939"
SRC_URI[sha256sum] = "341d75fa8e654806b77f439a1e82959974366382947ef70df434047c7680adca"

S = "${WORKDIR}/mvsim-release-release-melodic-mvsim-0.2.1-0"

inherit catkin
