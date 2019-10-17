DESCRIPTION = "fcl_catkin"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libccd-dev libeigen octomap"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wxmerkt/fcl_catkin-release/archive/release/melodic/fcl_catkin/0.5.99-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4fa9c0c03dfcec4d05cdd7d25cbdfb46"
SRC_URI[sha256sum] = "81289561207c772f90d4fb4374549782e2dadfb957aa56d0f578bf6813755bf9"

S = "${WORKDIR}/fcl_catkin-release-release-melodic-fcl_catkin-0.5.99-1"

inherit catkin
