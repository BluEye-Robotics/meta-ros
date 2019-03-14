DESCRIPTION = "Bindings between Numpy and Eigen using Boost. Python - wrapped for catkin."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "git python python-numpy libeigen boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/eigenpy_catkin-release/archive/release/melodic/eigenpy/1.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e6e00cac302d7d77c9e72f446f42eb7"
SRC_URI[sha256sum] = "407300df55fa840ad29485ae7f9506e49482bad4b9783aef2bf6d90afe163f4b"

S = "${WORKDIR}/eigenpy_catkin-release-release-melodic-eigenpy-1.5.0-1"

inherit catkin
