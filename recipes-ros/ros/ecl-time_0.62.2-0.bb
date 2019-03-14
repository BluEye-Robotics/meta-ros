DESCRIPTION = "Timing utilities are very dependent on the system api provided for their use. 	This package provides a means for handling different timing models. Current support		- posix rt : complete. 	- macosx : posix timers only, missing absolute timers. 	- win : none."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build ecl-config ecl-errors ecl-exceptions ecl-time-lite ecl-license ecl-build ecl-config ecl-errors ecl-exceptions ecl-time-lite"

RDEPENDS_${PN} = "ecl-license ecl-build ecl-config ecl-errors ecl-exceptions ecl-time-lite"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_time/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1b530398a42bd725ba1669ee22c3f6f4"
SRC_URI[sha256sum] = "3be2a120f7f4b5a020daac7cc5b8715c2af79c7d2d3c899ac49f2b6640065c04"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_time-0.62.2-0"

inherit catkin
