DESCRIPTION = "C++ ROS message and service generators."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg genmsg"

RDEPENDS_${PN} = "genmsg"

SRC_URI = "https://github.com/ros-gbp/gencpp-release/archive/release/melodic/gencpp/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f1b04b0417e3af83c066d809f4145cfa"
SRC_URI[sha256sum] = "1af09664865721b0def7aaf10487aff7de56de53e2d13be79efcf8432de0e437"

S = "${WORKDIR}/gencpp-release-release-melodic-gencpp-0.6.1-0"

inherit catkin
