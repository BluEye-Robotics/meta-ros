DESCRIPTION = "ROS models for HEBI components"
AUTHOR = "Matthew Tesch"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "urdf urdf"

RDEPENDS_${PN} = "urdf"

SRC_URI = "https://github.com/HebiRobotics/hebi_description-release/archive/release/melodic/hebi_description/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "60decfa6f187a918a274475d7785d017"
SRC_URI[sha256sum] = "a98ed8c034550c518fac9fe8eca1f14ae662278efcd5089abe07f90a4e6a4df0"

S = "${WORKDIR}/hebi_description-release-release-melodic-hebi_description-0.1.0-1"

inherit catkin
