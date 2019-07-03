DESCRIPTION = "A light-weight, Eigen-based C++ library for trajectory optimization for legged robots. This library provides implementations for variables, costs and constraints that can be used to represent a legged locomotion problem. The resulting Nonlinear Programming Problem (NLP) can then be solved with off-the-shelf solvers, e. g. Ipopt using the generic optimizer interface"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ifopt libeigen"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/ethz-adrl/towr-release/archive/release/melodic/towr/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "71e9c51a1d0d92e0749519e5314f53ee"
SRC_URI[sha256sum] = "62df4c4444a14ce7bfb5bef8fbcd602942cb97a36b24ed7a7413575568b9a50f"

S = "${WORKDIR}/towr-release-release-melodic-towr-1.4.1-0"

inherit catkin
