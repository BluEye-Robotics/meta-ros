DESCRIPTION = "Javascript ROS message and service generators."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "genmsg genmsg"

RDEPENDS_${PN} = "genmsg"

SRC_URI = "https://github.com/RethinkRobotics-release/gennodejs-release/archive/release/melodic/gennodejs/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0f4e2609eb2faa411c7c50baa8395b3b"
SRC_URI[sha256sum] = "09d5f9ee001d83dd19c111dc8c2d995b9e9a90e21df2a379b882ac555b9bc9b1"

S = "${WORKDIR}/gennodejs-release-release-melodic-gennodejs-2.0.1-0"

inherit catkin
