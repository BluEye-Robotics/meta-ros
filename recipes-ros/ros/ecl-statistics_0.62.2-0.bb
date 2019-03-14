DESCRIPTION = "Common statistical structures and algorithms for control systems."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-config ecl-linear-algebra ecl-mpl ecl-type-traits ecl-build ecl-license ecl-config ecl-linear-algebra ecl-mpl ecl-type-traits"

RDEPENDS_${PN} = "ecl-build ecl-license ecl-config ecl-linear-algebra ecl-mpl ecl-type-traits"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_statistics/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3897982bbd47bec0b3a3259d48eb34a6"
SRC_URI[sha256sum] = "67ed25a3f69aa9d272c6c700e2b079115fddd28ed7b0f020f1fec28061a7579b"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_statistics-0.62.2-0"

inherit catkin
