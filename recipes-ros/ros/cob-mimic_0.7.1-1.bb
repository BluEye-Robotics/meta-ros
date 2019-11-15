DESCRIPTION = "This package implements the Care-O-bot mimic"
AUTHOR = "Nadia Hammoudeh Garcia"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs actionlib boost diagnostic-updater diagnostic-msgs libvlc-dev roscpp roslib vlc"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_mimic/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7c77e317f5f86ce7cb4cac60ad950f52"
SRC_URI[sha256sum] = "e86450cb27a266d0f7cd55fb6355d99e96383bf6dc7d0d4fbab48380c3feb2b1"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_mimic-0.7.1-1"

inherit catkin
