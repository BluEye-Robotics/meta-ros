DESCRIPTION = "Provides a signal/slot mechanism (in the same vein as qt sigslots, boost::signals etc for intra-process communication. These include some improvements - they do not need a preprocessor, are fully type safe, allow for simple connections via a posix style string identifier and are multithread-safe."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-threads ecl-license ecl-config ecl-threads"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-threads"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_sigslots/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4c3387f17413f89e654d8e17491b791a"
SRC_URI[sha256sum] = "092e00b6e973f3ea2fd160ff8c691a649c324192c2f06e8141cfa71ddb0e28b4"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_sigslots-0.62.2-0"

inherit catkin
