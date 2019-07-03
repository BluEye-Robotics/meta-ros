DESCRIPTION = "multisense_lib"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libpng12-dev cv-bridge libpng12-dev cv-bridge"

RDEPENDS_${PN} = "libpng12-dev cv-bridge"

SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense_lib/4.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18fd76d04e70ab3b943f82f19e343d5e"
SRC_URI[sha256sum] = "61da457dbdd57bfa74ac34de1523552ddb166945e81b648107bcaa7ef2eb7686"

ROS_SPN = "multisense_ros"
S = "${WORKDIR}/multisense_ros-release-release-melodic-multisense_lib-4.0.2-0"

inherit catkin
