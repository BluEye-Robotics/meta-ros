DESCRIPTION = "Interrupt cmd_vel by joystick input"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs sensor-msgs topic-tools neonavigation-common"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/joystick_interrupt/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f778f2da7e1a169d392c1639e438e4b"
SRC_URI[sha256sum] = "325373acc8a61be22e9e2b515320e0766b4eb4051674b988ae36a34f773a421d"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-joystick_interrupt-0.5.0-1"

inherit catkin
