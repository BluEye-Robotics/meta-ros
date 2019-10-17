DESCRIPTION = "EPOS2 motor controller driver"
AUTHOR = "Martí Morta Garriga"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "libftdi-dev libftdipp-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uos-gbp/epos2_motor_controller-release/archive/release/melodic/epos2_motor_controller/1.0.0-4.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "213e603f3546a8e059bc98db1f43ff2e"
SRC_URI[sha256sum] = "a3ded96b006dada269b4e63754b818f5c60a39efef9a6ae753824d702702565e"

S = "${WORKDIR}/epos2_motor_controller-release-release-melodic-epos2_motor_controller-1.0.0-4"

inherit catkin
