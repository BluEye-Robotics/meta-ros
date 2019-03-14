DESCRIPTION = "Underlying data libraries for roscpp messages."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common roscpp-serialization roscpp-traits rostime"

RDEPENDS_${PN} = "cpp-common roscpp-serialization roscpp-traits rostime"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_core/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "24a26bd29cf56f77e1c4352370de1f4a"
SRC_URI[sha256sum] = "814ea5bddeba2cabb4229baa27006fe21dbc56f0fd51bf3afd5e20a22b4582ec"

S = "${WORKDIR}/roscpp_core-release-release-melodic-roscpp_core-0.6.12-0"

inherit catkin
