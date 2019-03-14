DESCRIPTION = "Contains messages and services for MAV communication"
AUTHOR = "Simon Lynen"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "mav-msgs mav-planning-msgs"

RDEPENDS_${PN} = "mav-msgs mav-planning-msgs"

SRC_URI = "https://github.com/ethz-asl/mav_comm-release/archive/release/melodic/mav_comm/3.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9fefa0b77223e36fbceae186e44fe68f"
SRC_URI[sha256sum] = "58c58a99785c47a9b06a616dfc6d579251b7a18caf26b6acb7702fab69df27cc"

S = "${WORKDIR}/mav_comm-release-release-melodic-mav_comm-3.3.2-0"

inherit catkin
