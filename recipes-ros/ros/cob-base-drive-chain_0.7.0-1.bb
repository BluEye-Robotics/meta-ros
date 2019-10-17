DESCRIPTION = "This package contains classes that are able to control the platform of the Care-O-Bot. This means to establish a CAN communication to drive and steering motors of the platform and later send motion commands and receive motor information."
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation cob-canopen-motor cob-generic-can cob-utilities control-msgs diagnostic-msgs roscpp sensor-msgs std-msgs std-srvs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_base_drive_chain/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "386951ad3bc89fce5b8e95dae1c517ca"
SRC_URI[sha256sum] = "f5d79bcd8f90405a99ef4689d3760f4dfaec222460817bfadfc4cc848ebe0fec"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_base_drive_chain-0.7.0-1"

inherit catkin
