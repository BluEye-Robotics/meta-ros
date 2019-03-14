DESCRIPTION = "A light-weight, Eigen-based C++ library for trajectory optimization for legged robots. This library provides implementations for variables, costs and constraints that can be used to represent a legged locomotion problem. The resulting Nonlinear Programming Problem (NLP) can then be solved with off-the-shelf solvers, e. g. Ipopt using the generic optimizer interface"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ifopt libeigen"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/ethz-adrl/towr-release/archive/release/melodic/towr/1.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e38e9d7d33e03e990cbd9ed5303ba63b"
SRC_URI[sha256sum] = "18224d80b20f9ee0fbce448953e2ceccb1d7b4b9b99f54d7a95c33d11eb7da43"

S = "${WORKDIR}/towr-release-release-melodic-towr-1.4.0-0"

inherit catkin
