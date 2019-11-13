DESCRIPTION = "Bindings between Numpy and Eigen using Boost. Python"
AUTHOR = "Justin Carpentier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git doxygen python python-numpy libeigen boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/eigenpy_catkin-release/archive/release/melodic/eigenpy/1.6.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "63c0f0696c36f09ee8d9b83f250b0498"
SRC_URI[sha256sum] = "bab4be0a0fb2f1451b36c8ead0d0b45714946cf9fcc98a4b465f2517d2ea4c13"

S = "${WORKDIR}/eigenpy_catkin-release-release-melodic-eigenpy-1.6.5-1"

inherit catkin
