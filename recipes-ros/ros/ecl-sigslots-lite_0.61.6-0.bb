DESCRIPTION = "This avoids use of dynamic storage (malloc/new) and thread safety (mutexes) to provide a very simple sigslots implementation that can be used for *very* embedded development."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-errors ecl-license ecl-config ecl-errors"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-errors"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_sigslots_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e05c6bc22264996c0483984012fdc77f"
SRC_URI[sha256sum] = "6f41052abdb5ac99e0e5d7e0675b2798d1cc570cebd16b303e035b00d66afe96"

ROS_SPN = "ecl_lite"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_sigslots_lite-0.61.6-0"

inherit catkin
