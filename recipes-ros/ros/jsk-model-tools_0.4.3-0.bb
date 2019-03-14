DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "eus-assimp euscollada"

RDEPENDS_${PN} = "eus-assimp euscollada"

SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/melodic/jsk_model_tools/0.4.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3a160e37d70e615aff7fb0b3a719186b"
SRC_URI[sha256sum] = "41abafed65016c7f1f4825f689b95a45fcf1d8d93eeec12752ea0f1f728521a2"

S = "${WORKDIR}/jsk_model_tools-release-release-melodic-jsk_model_tools-0.4.3-0"

inherit catkin
