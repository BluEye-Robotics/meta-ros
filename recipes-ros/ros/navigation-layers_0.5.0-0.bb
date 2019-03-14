DESCRIPTION = "Extra navigation layers."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3451ac68c96ad046452aa1310ca3a903"

DEPENDS = ""

RDEPENDS_${PN} = "range-sensor-layer social-navigation-layers"

SRC_URI = "https://github.com/wu-robotics/navigation_layers_release/archive/release/melodic/navigation_layers/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fdc5ad753fdc0723120d6dbec37905e4"
SRC_URI[sha256sum] = "e51022d7bd6b2c049f58961b026a30460ce71607b1905c283e7b2626b653f359"

S = "${WORKDIR}/navigation_layers_release-release-melodic-navigation_layers-0.5.0-0"

inherit catkin
