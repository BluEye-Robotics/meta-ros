DESCRIPTION = "This package implements the Care-O-bot mimic"
AUTHOR = "Nadia Hammoudeh Garcia"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs actionlib boost diagnostic-updater diagnostic-msgs libvlc-dev roscpp roslib vlc"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_mimic/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "192168315457e75cd971edade5a8b9bf"
SRC_URI[sha256sum] = "b7d6d615ce465cc46089aee0e1fe2720dc862ebf4077ca00143312c7aa24bdcd"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_mimic-0.7.0-1"

inherit catkin
