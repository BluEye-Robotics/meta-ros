DESCRIPTION = "The cob_footprint_observer package adjusts the footprint of the robot based on the setup (e. g. arm and/or tray)."
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation boost geometry-msgs roscpp std-msgs tf"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_footprint_observer/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "475fc9d528017fdf9c9c609b1e81e723"
SRC_URI[sha256sum] = "e4bb923bb34919eb110cf91ee9c5312ee3bd9fca1e79f1c995baa33c00e27584"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_footprint_observer-0.8.0-1"

inherit catkin
