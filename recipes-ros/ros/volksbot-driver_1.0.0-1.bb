DESCRIPTION = "Driver for the Volksbot robot."
AUTHOR = "Jochen Sprickerhof"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "epos2-motor-controller geometry-msgs nav-msgs roscpp sensor-msgs tf"

RDEPENDS_${PN} = "epos2-motor-controller roscpp sensor-msgs geometry-msgs nav-msgs tf"

SRC_URI = "https://github.com/uos-gbp/volksbot_driver-release/archive/release/melodic/volksbot_driver/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fc5dafea75eab2bde33db465ce5729cc"
SRC_URI[sha256sum] = "c8cb933054437dd270a0a2171f0dc56922538911d1b32ea5dbb1cea60bd95880"

S = "${WORKDIR}/volksbot_driver-release-release-melodic-volksbot_driver-1.0.0-1"

inherit catkin
