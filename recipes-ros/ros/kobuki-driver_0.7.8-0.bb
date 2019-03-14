DESCRIPTION = "C++ driver library for Kobuki: Pure C++ driver library for Kobuki. This is for those who do not wish to use ROS on their systems."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-mobile-robot ecl-converters ecl-devices ecl-geometry ecl-sigslots ecl-time ecl-command-line ecl-mobile-robot ecl-converters ecl-devices ecl-geometry ecl-sigslots ecl-time ecl-command-line"

RDEPENDS_${PN} = "ecl-mobile-robot ecl-converters ecl-devices ecl-geometry ecl-sigslots ecl-time ecl-command-line"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_driver/0.7.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb1becd0b45cb57aaced3b9c5d9fe998"
SRC_URI[sha256sum] = "7cfcc4b9309c4a352fa54c9a6cb0fb0b53a5da43a0243aa13556670ec97bd34e"

ROS_SPN = "kobuki_core"
S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_driver-0.7.8-0"

inherit catkin
