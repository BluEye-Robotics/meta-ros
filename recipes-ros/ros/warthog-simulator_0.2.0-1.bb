DESCRIPTION = "Packages for simulating Warthog"
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "warthog-gazebo"

RDEPENDS_${PN} = "warthog-gazebo"

SRC_URI = "https://github.com/clearpath-gbp/warthog_simulator-release/archive/release/melodic/warthog_simulator/0.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a71eaf8646aa3b7cac5baeeec5c89808"
SRC_URI[sha256sum] = "f69612ee91e13eee317ed9eb5595954cf3fef3b77ef55594f33e188c77850e70"

S = "${WORKDIR}/warthog_simulator-release-release-melodic-warthog_simulator-0.2.0-1"

inherit catkin
