DESCRIPTION = "Most implementations (windows, posix, . . . ) have slightly different api for low level input-output functions. These are gathered here and re-represented with a cross platform set of functions."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-errors ecl-license ecl-config ecl-errors"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-errors"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_io/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2010250319aaa59ed17fa65829432e94"
SRC_URI[sha256sum] = "8ed29cb5c059af11e82868c532fedfcefd85d2e4d8d16f97bee45fb5af9b6ee4"

ROS_SPN = "ecl_lite"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_io-0.61.6-0"

inherit catkin
