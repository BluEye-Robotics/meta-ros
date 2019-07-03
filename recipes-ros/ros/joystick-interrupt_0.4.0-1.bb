DESCRIPTION = "Interrupt cmd_vel by joystick input"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs sensor-msgs topic-tools neonavigation-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/joystick_interrupt/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72f7d13c8a3659d3a4e1b9d5ff0698a0"
SRC_URI[sha256sum] = "46e6ef77e5face92d3b48f5f4f62ad1452996f145956203f807e112b17af84af"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-joystick_interrupt-0.4.0-1"

inherit catkin
