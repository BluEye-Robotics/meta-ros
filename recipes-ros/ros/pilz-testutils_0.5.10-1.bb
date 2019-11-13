DESCRIPTION = "This package contains testing utilities used by Pilz packages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_testutils/0.5.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd71fce4d28dee4c9dff7b1dc58ae0d2"
SRC_URI[sha256sum] = "bcfc4b902c1633df1341ab810da19cc700eb22286034be66f0ca3caf18b41460"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_testutils-0.5.10-1"

inherit catkin
