DESCRIPTION = "Extension of locomotor that implements move_base's functionality."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "locomotor move-base-msgs nav-2d-utils nav-core nav-core-adapter"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/locomove_base/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "57c104a2d0bd3fbbd9e755dc7e9aede7"
SRC_URI[sha256sum] = "f8eb11d52a5e4b23ba8563021f1273b28f5be9f690335ab490ae50ca34f23b30"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-locomove_base-0.2.5-1"

inherit catkin
