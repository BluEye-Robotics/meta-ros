DESCRIPTION = "Packages for working with Jackal from a ROS desktop."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "jackal-msgs jackal-viz"

RDEPENDS_${PN} = "jackal-msgs jackal-viz"

SRC_URI = "https://github.com/clearpath-gbp/jackal_desktop-release/archive/release/melodic/jackal_desktop/0.3.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6ad9b3cfc3995aff29dfa1e60b0b937"
SRC_URI[sha256sum] = "75057128589c98a64195ceccf02f1fa7595d11b7536fe69c0187b42f5ae3829c"

S = "${WORKDIR}/jackal_desktop-release-release-melodic-jackal_desktop-0.3.2-1"

inherit catkin
