DESCRIPTION = "The cob_footprint_observer package adjusts the footprint of the robot based on the setup (e. g. arm and/or tray)."
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation boost geometry-msgs roscpp std-msgs tf"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_footprint_observer/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "82012d7a0ef1cd17d03ab04d77280363"
SRC_URI[sha256sum] = "9bacb5b8aff7810ca1e8dea91ccb400aeaea17a5921bdc7889142212f7e0c143"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_footprint_observer-0.8.1-1"

inherit catkin
