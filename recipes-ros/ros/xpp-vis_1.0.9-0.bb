DESCRIPTION = "Visualization for the XPP Motion Framework."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf kdl-parser robot-state-publisher visualization-msgs xpp-states xpp-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_vis/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "04541f4884dea5ca09e85a13a75384c9"
SRC_URI[sha256sum] = "27a413f9b6c6b80509d79ccab7f27e83cc2245361d958023980e36b5578a9632"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_vis-1.0.9-0"

inherit catkin
