DESCRIPTION = "This package contains the source code for testing and comparing trac_ik"
AUTHOR = "Patrick Beeson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost trac-ik-lib orocos-kdl boost orocos-kdl trac-ik-lib xacro"

RDEPENDS_${PN} = "boost orocos-kdl trac-ik-lib xacro"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_examples/1.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3002c5220357ec63f11cfcd1385261f4"
SRC_URI[sha256sum] = "49d6aacadb0b51e61c60dfadbcb86be6408dd9887a126fb6db9b429f96d380c3"

ROS_SPN = "trac_ik"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_examples-1.5.0-1"

inherit catkin
