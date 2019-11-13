DESCRIPTION = "Catkin integration for HAROS (version 3. 6. 0)"
AUTHOR = "Andre Santos (HAROS)"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-virtualenv"

RDEPENDS_${PN} = "cccc cppcheck"

SRC_URI = "https://github.com/rosin-project/haros_catkin-release/archive/release/melodic/haros_catkin/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6153d4a0d2cf378a8083c9f54cebcfa8"
SRC_URI[sha256sum] = "b8b53adbf7f2de24566dc6990f033e9d7c397e37dbcc0c54f19b7e03a601371d"

S = "${WORKDIR}/haros_catkin-release-release-melodic-haros_catkin-0.1.1-1"

inherit catkin
