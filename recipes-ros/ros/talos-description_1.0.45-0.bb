DESCRIPTION = "The talos_description package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1fcc2f243daac9b962ca04b90988c4f3"

DEPENDS = ""

RDEPENDS_${PN} = "talos-description-calibration talos-description-inertial"

SRC_URI = "https://github.com/pal-gbp/talos_robot-release/archive/release/melodic/talos_description/1.0.45-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fac79000367eb41a4221c02eaa71b5b"
SRC_URI[sha256sum] = "a50d729ebe08f18e3cf29dc44d284453434e04c9dc2b41be74bf5e7ec79832c0"

ROS_SPN = "talos_robot"
S = "${WORKDIR}/talos_robot-release-release-melodic-talos_description-1.0.45-0"

inherit catkin
