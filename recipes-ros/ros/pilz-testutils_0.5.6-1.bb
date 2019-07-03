DESCRIPTION = "This package contains testing utilities used by Pilz packages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_testutils/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "78378a6e7a2d9f7a94eda8040e345ffa"
SRC_URI[sha256sum] = "4c980dc2960be75e4840e272111885b94bab91c3768e758f651c0949a33e9541"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_testutils-0.5.6-1"

inherit catkin
