DESCRIPTION = "Any tools relating to mathematical geometry. Primarily featuring polynomials and interpolations."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-config ecl-type-traits ecl-containers ecl-formatters ecl-linear-algebra ecl-exceptions ecl-math ecl-mpl ecl-build ecl-license ecl-config ecl-type-traits ecl-containers ecl-formatters ecl-linear-algebra ecl-exceptions ecl-math ecl-mpl"

RDEPENDS_${PN} = "ecl-build ecl-license ecl-config ecl-type-traits ecl-containers ecl-formatters ecl-linear-algebra ecl-exceptions ecl-math ecl-mpl"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_geometry/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e9d1e57b8392aa007b84836ddf75e98b"
SRC_URI[sha256sum] = "ba8a9aeaf31e8a0d1c6a0411fa1898c92894dfce06453d0882c7eeb000d88406"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_geometry-0.62.2-0"

inherit catkin
