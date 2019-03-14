DESCRIPTION = "Simulation packages for OpenManipulator"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "open-manipulator-gazebo"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_simulations-release/archive/release/melodic/open_manipulator_simulations/1.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "abb238160ef4f3955c512d8e278abb6b"
SRC_URI[sha256sum] = "5e55fe725d7a194014a7ba81ec9ba3436209a0076a05799156ccf09bceb657b4"

S = "${WORKDIR}/open_manipulator_simulations-release-release-melodic-open_manipulator_simulations-1.1.0-1"

inherit catkin
