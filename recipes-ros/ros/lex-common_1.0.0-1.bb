DESCRIPTION = "Lex Common utilities, intended for use by Lex clients"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=80318c4afef111a7690eaf237460856b"

DEPENDS = "catkin ament-cmake ros-environment aws-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/lex_common-release/archive/release/melodic/lex_common/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4aa14eed9405bd5d8902583352c81440"
SRC_URI[sha256sum] = "69a222e4226dfcaf24a2a5c923b70f37b411c95a51ae870b97a6734178cd8536"

S = "${WORKDIR}/lex_common-release-release-melodic-lex_common-1.0.0-1"

inherit catkin
