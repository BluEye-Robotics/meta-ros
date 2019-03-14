DESCRIPTION = "swri_console_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp swri-math-util"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_console_util/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "786170d0993407a26678fcfcd5775aaf"
SRC_URI[sha256sum] = "ff9b6fe8eabe6b0e3ce0e727bfffb3f6ae95694446964db3e5db3f39407568bf"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_console_util-2.8.0-0"

inherit catkin
