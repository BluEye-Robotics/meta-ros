DESCRIPTION = "Internal packaging of the 2. 2. 2 version of the python semantic version module."
AUTHOR = "Raphaël Barrois"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_semantic_version/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80ad83865b2d5129f0d0522684dede1d"
SRC_URI[sha256sum] = "ede22535e402aab843576c2189701ec11878f469e61d6f1055d6822779d2f4c2"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_semantic_version-0.3.2-0"

inherit catkin
