DESCRIPTION = "This stack includes packages that provide access to the Schunk hardware through ROS messages, services and actions."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "schunk-description schunk-libm5api schunk-powercube-chain schunk-sdh schunk-simulated-tactile-sensors"

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_modular_robotics/0.6.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a46c724cae8bd983c2b7aefbb441fccf"
SRC_URI[sha256sum] = "959d9afc2494f0a20d484eb9719a7d019ffe8d3c1ebe9217d619b2e0b162c55f"

S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_modular_robotics-0.6.13-2"

inherit catkin
