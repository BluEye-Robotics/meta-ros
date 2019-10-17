DESCRIPTION = "Bindings between Numpy and Eigen using Boost. Python - wrapped for catkin."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git python python3-numpy libeigen boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/eigenpy_catkin-release/archive/release/melodic/eigenpy/1.5.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "38a734a5b89c77792bf466ca69c14338"
SRC_URI[sha256sum] = "c8cf3b85343d3d89898496db8b1f5fcdfc1d3c5c43611cafb1871d7594c21a68"

S = "${WORKDIR}/eigenpy_catkin-release-release-melodic-eigenpy-1.5.1-2"

inherit catkin
