DESCRIPTION = "This package contains the manipulation API and functions for controlling the manipulator."
AUTHOR = "Hye-Jong KIM"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp cmake-modules libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/robotis_manipulator-release/archive/release/melodic/robotis_manipulator/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7bff035707c9f31e402b9a14834d4740"
SRC_URI[sha256sum] = "3e32af08b49c5a8b698e9e98b01c1fee182559c0b5e96025fc1be922ff306478"

S = "${WORKDIR}/robotis_manipulator-release-release-melodic-robotis_manipulator-1.0.0-0"

inherit catkin
