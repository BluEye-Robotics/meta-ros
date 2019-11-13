DESCRIPTION = "gps_umd metapackage"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gpsd-client gps-common"

RDEPENDS_${PN} = "gpsd-client gps-common"

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gps_umd/0.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca20558cd4d37b4812cfce3781a05766"
SRC_URI[sha256sum] = "b90b7c8cafcf792e3a7be93681d25496754414d8c389e648b023b53336f4a6b2"

S = "${WORKDIR}/gps_umd-release-release-melodic-gps_umd-0.3.0-1"

inherit catkin
