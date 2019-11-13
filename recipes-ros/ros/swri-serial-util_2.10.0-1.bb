DESCRIPTION = "swri_serial_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_serial_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a95fe1c4e03e198e3d7f0ccc29445f8f"
SRC_URI[sha256sum] = "d3c76b1ba3759a0d75024b01fe7f923990f12c1f0095b8f123ce321e9a1a2a51"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_serial_util-2.10.0-1"

inherit catkin
