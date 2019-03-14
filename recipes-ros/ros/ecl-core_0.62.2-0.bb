DESCRIPTION = "A set of tools and interfaces extending the capabilities of c++ to provide a lightweight, consistent interface with a focus for control programming."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-command-line ecl-concepts ecl-containers ecl-converters ecl-core-apps ecl-devices ecl-eigen ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-linear-algebra ecl-math ecl-mpl ecl-sigslots ecl-statistics ecl-streams ecl-threads ecl-time ecl-type-traits ecl-utilities"

RDEPENDS_${PN} = "ecl-command-line ecl-concepts ecl-containers ecl-converters ecl-core-apps ecl-devices ecl-eigen ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-linear-algebra ecl-math ecl-mpl ecl-sigslots ecl-statistics ecl-streams ecl-threads ecl-time ecl-type-traits ecl-utilities"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_core/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ef8a38da813678b53a863b063efa24d8"
SRC_URI[sha256sum] = "faf777d4df832763a55bb0e32b19e5bc391f094d21aaec4acce62c11ed1695d5"

S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_core-0.62.2-0"

inherit catkin
