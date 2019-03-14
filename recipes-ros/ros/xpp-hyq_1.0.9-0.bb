DESCRIPTION = "HyQ-robot specific functions for visualization in the XPP Motion Framework. These include inverse kinematics as well as urdf files for a one-legged, two-legged and four legged robot with"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp xpp-vis"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_hyq/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0d2aecd4d0cc2341420d5fe73c0f6201"
SRC_URI[sha256sum] = "926fef74e45d3606fae7f4802cab03a73b49c3372e4fa9e71880366c15f429e4"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_hyq-1.0.9-0"

inherit catkin
