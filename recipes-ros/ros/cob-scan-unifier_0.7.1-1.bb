DESCRIPTION = "The cob_scan_unifier package holds code to unify two or more laser-scans to one unified scan-message"
AUTHOR = "Florian Mirus"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "laser-geometry roscpp sensor-msgs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_scan_unifier/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "517c1b838de48dffbeec20a3d7bf161e"
SRC_URI[sha256sum] = "477f18ad9acf1597dcb1bcf087decdc9e932611a3b8a1fa3bb027971e7f01560"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_scan_unifier-0.7.1-1"

inherit catkin
