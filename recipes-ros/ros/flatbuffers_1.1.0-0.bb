DESCRIPTION = "Google flatbuffers."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/flatbuffers-release/archive/release/melodic/flatbuffers/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9eadcf2dcac3e1a2027a7752d647607a"
SRC_URI[sha256sum] = "5795283a62da224d9cf76e21ea581f48ce9e1bc37be751aaf547cfbba77a1bf8"

S = "${WORKDIR}/flatbuffers-release-release-melodic-flatbuffers-1.1.0-0"

inherit catkin
