DESCRIPTION = "gps_umd metapackage"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gpsd-client gps-common"

RDEPENDS_${PN} = "gpsd-client gps-common"

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gps_umd/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b10ff858cc8753d0c42082e5cf7755d5"
SRC_URI[sha256sum] = "8a74ec06defb2718bb21ef216302cc99a063ddf7f3cca8fe8b5a836a9aca9cb8"

S = "${WORKDIR}/gps_umd-release-release-melodic-gps_umd-0.2.0-0"

inherit catkin
