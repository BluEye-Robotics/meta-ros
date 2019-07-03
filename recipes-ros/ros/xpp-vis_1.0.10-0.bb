DESCRIPTION = "Visualization for the XPP Motion Framework."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf kdl-parser robot-state-publisher visualization-msgs xpp-states xpp-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_vis/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bb25e529519ab3ee7d8ea18def26b03b"
SRC_URI[sha256sum] = "a28dddd1ac40ec97257e52ee5f1dc6b2a0989fcf0fceccba4698019bbcfe56e7"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_vis-1.0.10-0"

inherit catkin
