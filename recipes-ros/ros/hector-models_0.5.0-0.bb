DESCRIPTION = "hector_models contains (urdf) models of robots, sensors etc."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hector-sensors-description hector-xacro-tools"

RDEPENDS_${PN} = "hector-sensors-description hector-xacro-tools"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/melodic/hector_models/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bcbe2abc08a427816c49b9a59382f3fb"
SRC_URI[sha256sum] = "aea206089e02162e6f34440dd82a3c9f0c66f4030e8dc4738838c77a9afc6701"

S = "${WORKDIR}/hector_models-release-release-melodic-hector_models-0.5.0-0"

inherit catkin
