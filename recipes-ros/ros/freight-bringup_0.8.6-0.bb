DESCRIPTION = "Bringup for freight"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1fcc2f243daac9b962ca04b90988c4f3"

DEPENDS = ""

RDEPENDS_${PN} = "diagnostic-aggregator fetch-description fetch-drivers fetch-navigation fetch-open-auto-dock fetch-teleop graft joy ps3joy robot-state-publisher sick-tim"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_robots-release/archive/release/melodic/freight_bringup/0.8.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "917365fc5c4ccbd46fdd105f37b241ad"
SRC_URI[sha256sum] = "303f84a14b664ef2e11fc0d5cde7727ceda68cd925a10ff5ddefdec5420a9676"

ROS_SPN = "fetch_robots"
S = "${WORKDIR}/fetch_robots-release-release-melodic-freight_bringup-0.8.6-0"

inherit catkin
