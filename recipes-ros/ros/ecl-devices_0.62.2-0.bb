DESCRIPTION = "Provides an extensible and standardised framework for input-output devices."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-errors ecl-mpl ecl-type-traits ecl-utilities ecl-containers ecl-threads ecl-license ecl-config ecl-errors ecl-mpl ecl-type-traits ecl-utilities ecl-containers ecl-threads"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-errors ecl-mpl ecl-type-traits ecl-utilities ecl-containers ecl-threads"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_devices/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "301dbec64f3210c278a126aab12238b2"
SRC_URI[sha256sum] = "8fdd41c3aab78f532ddc8c228da3778ecdcb64e8a566952f1ec9dc4f026ba144"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_devices-0.62.2-0"

inherit catkin
