DESCRIPTION = "EPOS2 motor controller driver"
AUTHOR = "Martí Morta Garriga"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "libftdipp-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uos-gbp/epos2_motor_controller-release/archive/release/melodic/epos2_motor_controller/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5f2b98a32286ef313143015d20b8ddd"
SRC_URI[sha256sum] = "11d26dcb5fc80fa69dd59c57b0a07ecae949192e92489d817a5fcaa5ff3ecf0c"

S = "${WORKDIR}/epos2_motor_controller-release-release-melodic-epos2_motor_controller-1.0.0-1"

inherit catkin
