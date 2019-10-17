DESCRIPTION = "Packages for working with Warthog from a ROS desktop."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "warthog-msgs warthog-viz"

RDEPENDS_${PN} = "warthog-msgs warthog-viz"

SRC_URI = "https://github.com/clearpath-gbp/warthog_desktop-release/archive/release/melodic/warthog_desktop/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bdc3b5e330bd5719c1b874e23240ee24"
SRC_URI[sha256sum] = "3b839c59095be96b5f39a0473d13467834a3f7ef43d4bcbd7e53befb569025c8"

S = "${WORKDIR}/warthog_desktop-release-release-melodic-warthog_desktop-0.0.1-1"

inherit catkin
