DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of different schunk components. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_description/0.6.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d3da816fa1e24969792e593ed0b0e5e6"
SRC_URI[sha256sum] = "b3ae5b1d2b3c99078751a4450ec523fbc8727ed3e2b79dbf78d7c3a8a1d80532"

ROS_SPN = "schunk_modular_robotics"
S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_description-0.6.13-2"

inherit catkin
