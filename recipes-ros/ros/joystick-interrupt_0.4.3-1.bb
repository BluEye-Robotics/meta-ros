DESCRIPTION = "Interrupt cmd_vel by joystick input"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs sensor-msgs topic-tools neonavigation-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/joystick_interrupt/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd7e01d54330ebbf78244731d93393c6"
SRC_URI[sha256sum] = "bca4cdab1413bb76cfd4e90279ddc3b39802eeec405d81ce46467b1f6f4578ca"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-joystick_interrupt-0.4.3-1"

inherit catkin
