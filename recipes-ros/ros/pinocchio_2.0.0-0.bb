DESCRIPTION = "A fast and flexible implementation of Rigid Body Dynamics algorithms and their analytical derivatives - wrapped for catkin."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git python python-numpy urdfdom libeigen boost eigenpy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/pinocchio_catkin-release/archive/release/melodic/pinocchio/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "325a6b26699ba06be27637a2cfe621bb"
SRC_URI[sha256sum] = "8f84f420cbee52acb26755fd7bdba3f06013bccc0f1134d080f1bca9a37fa7ff"

S = "${WORKDIR}/pinocchio_catkin-release-release-melodic-pinocchio-2.0.0-0"

inherit catkin
