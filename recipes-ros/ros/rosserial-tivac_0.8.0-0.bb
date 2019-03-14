DESCRIPTION = "rosserial for TivaC Launchpad evaluation boards."
AUTHOR = "Vitor Matos"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosserial-msgs rosserial-client"

RDEPENDS_${PN} = "rosserial-msgs rosserial-client"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_tivac/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e26c18a64da6f73d0beb5bb2a9108922"
SRC_URI[sha256sum] = "3d4ce56cd9d2dd5e1d51afa86467890aa0d06c97b7342f7d469640eaa09c1372"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_tivac-0.8.0-0"

inherit catkin
