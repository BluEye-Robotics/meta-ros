DESCRIPTION = "Visualization launchers and helpers for Warthog."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch warthog-description joint-state-publisher"

RDEPENDS_${PN} = "warthog-description joint-state-publisher"

SRC_URI = "https://github.com/clearpath-gbp/warthog_desktop-release/archive/release/melodic/warthog_viz/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9649e2e35968fa1d39089a88098edfba"
SRC_URI[sha256sum] = "627e058e9037beadb575229c7dadfc27003f278a83edb1177aa271629be1e6d1"

ROS_SPN = "warthog_desktop"
S = "${WORKDIR}/warthog_desktop-release-release-melodic-warthog_viz-0.0.1-1"

inherit catkin
