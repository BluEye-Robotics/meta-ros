DESCRIPTION = "Power drivers for the PR2 robot."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-power-board power-monitor ocean-battery-driver"

RDEPENDS_${PN} = "pr2-power-board power-monitor ocean-battery-driver"

SRC_URI = "https://github.com/pr2-gbp/pr2_power_drivers-release/archive/release/melodic/pr2_power_drivers/1.1.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a7a03b44b1dda82ea8f546da18f89b5"
SRC_URI[sha256sum] = "a9c7ac432f7b7adbc1d91393381847c11f2ef23301a4ed5213b661d8855ed12c"

S = "${WORKDIR}/pr2_power_drivers-release-release-melodic-pr2_power_drivers-1.1.7-0"

inherit catkin
