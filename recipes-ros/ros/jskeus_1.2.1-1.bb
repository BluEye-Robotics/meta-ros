DESCRIPTION = "EusLisp software developed and used by JSK at The University of Tokyo"
AUTHOR = "JSK Alumnis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "euslisp euslisp"

RDEPENDS_${PN} = "euslisp"

SRC_URI = "https://github.com/tork-a/jskeus-release/archive/release/melodic/jskeus/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5c006f5fea5a4df61600fae7f2d41ea8"
SRC_URI[sha256sum] = "7029b7cebfd39f6ff41fe8988b972ec265072336cad162905116689fea92e59a"

S = "${WORKDIR}/jskeus-release-release-melodic-jskeus-1.2.1-1"

inherit catkin
