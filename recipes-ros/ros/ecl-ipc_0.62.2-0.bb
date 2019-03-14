DESCRIPTION = "Interprocess mechanisms vary greatly across platforms - sysv, posix, win32, there are more than a few. This package provides an infrastructure to allow for developing cross platform c++ wrappers around the lower level c api's that handle these mechanisms. These make it not only easier to utilise such mechanisms, but allow it to be done consistently across platforms."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build ecl-config ecl-errors ecl-time-lite ecl-exceptions ecl-time ecl-license ecl-build ecl-config ecl-errors ecl-time-lite ecl-exceptions ecl-time"

RDEPENDS_${PN} = "ecl-license ecl-build ecl-config ecl-errors ecl-time-lite ecl-exceptions ecl-time"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_ipc/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7e7fd1d3a221cd3e1503b82bfff9048a"
SRC_URI[sha256sum] = "35873c953237fc4218b4a354119e76304a5a8aa4c4147e2ccfab5aac4f3bf4dc"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_ipc-0.62.2-0"

inherit catkin
