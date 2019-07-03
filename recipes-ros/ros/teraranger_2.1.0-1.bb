DESCRIPTION = "This package provides ros nodes for single sensors from Terabee"
AUTHOR = "Kabaradjian Pierre-Louis"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp sensor-msgs std-msgs dynamic-reconfigure serial roscpp sensor-msgs std-msgs dynamic-reconfigure serial"

RDEPENDS_${PN} = "roscpp sensor-msgs std-msgs dynamic-reconfigure serial"

SRC_URI = "https://github.com/Terabee/teraranger-release/archive/release/melodic/teraranger/2.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0deece0c38c5c2bd641606e3f2b05ca7"
SRC_URI[sha256sum] = "7a46f25a882f135c1261b889e11462660d26f4b6e6d288d8b2026dfda5f4bc0a"

S = "${WORKDIR}/teraranger-release-release-melodic-teraranger-2.1.0-1"

inherit catkin
