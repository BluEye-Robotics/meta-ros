DESCRIPTION = "This includes a suite of programs demo'ing various aspects of the ecl_core. It also includes various benchmarking and utility programs for use primarily with embedded systems."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-config ecl-linear-algebra ecl-command-line ecl-converters ecl-containers ecl-devices ecl-errors ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-sigslots ecl-streams ecl-threads ecl-type-traits ecl-time-lite ecl-build ecl-license ecl-config ecl-linear-algebra ecl-command-line ecl-converters ecl-containers ecl-devices ecl-errors ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-sigslots ecl-streams ecl-threads ecl-type-traits ecl-time-lite"

RDEPENDS_${PN} = "ecl-build ecl-license ecl-config ecl-linear-algebra ecl-command-line ecl-converters ecl-containers ecl-devices ecl-errors ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-sigslots ecl-streams ecl-threads ecl-type-traits ecl-time-lite"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_core_apps/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "62fe0e97a69e46f5bab247bae3b75252"
SRC_URI[sha256sum] = "30a847ca6b096e1baf1be88d85936ab7f5fdabc5ce5e705b90ddd9972f84ccde"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_core_apps-0.62.2-0"

inherit catkin
