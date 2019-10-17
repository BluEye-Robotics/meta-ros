DESCRIPTION = "Bringup for freight"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1fcc2f243daac9b962ca04b90988c4f3"

DEPENDS = ""

RDEPENDS_${PN} = "diagnostic-aggregator fetch-description fetch-drivers fetch-navigation fetch-open-auto-dock fetch-teleop graft joy ps3joy robot-state-publisher sick-tim"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_robots-release/archive/release/melodic/freight_bringup/0.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6857062e8eadf19ff2e427665f76a1fe"
SRC_URI[sha256sum] = "4c838cc7caa4015cd00c8f8e1ba9e513b82094ae0982e120dd09497ec05c2d6d"

ROS_SPN = "fetch_robots"
S = "${WORKDIR}/fetch_robots-release-release-melodic-freight_bringup-0.8.8-1"

inherit catkin
