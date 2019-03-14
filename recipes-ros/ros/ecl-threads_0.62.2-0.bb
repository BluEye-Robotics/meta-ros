DESCRIPTION = "This package provides the c++ extensions for a variety of threaded programming tools. These are usually different on different platforms, so the architecture for a cross-platform framework is also implemented."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build ecl-config ecl-errors ecl-concepts ecl-exceptions ecl-time ecl-utilities ecl-license ecl-build ecl-config ecl-errors ecl-concepts ecl-exceptions ecl-time ecl-utilities"

RDEPENDS_${PN} = "ecl-license ecl-build ecl-config ecl-errors ecl-concepts ecl-exceptions ecl-time ecl-utilities"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_threads/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c3583a1d5f8be435e701a775c4765b3a"
SRC_URI[sha256sum] = "ba9d0e01c8f88af99570d7a92b88a2184521c7c4e4622a440a7ab7eea56af380"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_threads-0.62.2-0"

inherit catkin
