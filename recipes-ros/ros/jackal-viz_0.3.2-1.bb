DESCRIPTION = "Visualization launchers and helpers for Jackal."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch jackal-description joint-state-publisher"

RDEPENDS_${PN} = "jackal-description joint-state-publisher"

SRC_URI = "https://github.com/clearpath-gbp/jackal_desktop-release/archive/release/melodic/jackal_viz/0.3.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e2b29074c0c35e8b785e4d23052f057f"
SRC_URI[sha256sum] = "7849a0a3491f501d697a8146a432808113bcb48663d3b43651a109385602be6f"

ROS_SPN = "jackal_desktop"
S = "${WORKDIR}/jackal_desktop-release-release-melodic-jackal_viz-0.3.2-1"

inherit catkin
