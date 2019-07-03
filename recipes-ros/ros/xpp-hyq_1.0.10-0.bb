DESCRIPTION = "HyQ-robot specific functions for visualization in the XPP Motion Framework. These include inverse kinematics as well as urdf files for a one-legged, two-legged and four legged robot with"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "xacro roscpp xpp-vis"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_hyq/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9ac81feeeebae7228b1a776464dbf4d5"
SRC_URI[sha256sum] = "92f200e4ca8f3bb5c9b5e4b9657aadd436267efeae2f74f235a682ad9c3fca62"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_hyq-1.0.10-0"

inherit catkin
