DESCRIPTION = "hector_xacro_tools"
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "xacro"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/melodic/hector_xacro_tools/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ccd327718ff7e21d1a642eca91f90651"
SRC_URI[sha256sum] = "c3fb08b2e43e363415754750c0208062b87686415088d2eaf191d1f9879c95f9"

ROS_SPN = "hector_models"
S = "${WORKDIR}/hector_models-release-release-melodic-hector_xacro_tools-0.5.0-0"

inherit catkin
