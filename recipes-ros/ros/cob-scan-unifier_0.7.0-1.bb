DESCRIPTION = "The cob_scan_unifier package holds code to unify two or more laser-scans to one unified scan-message"
AUTHOR = "Florian Mirus"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "laser-geometry roscpp sensor-msgs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_scan_unifier/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "81af273d108f88770347a55a77c71b50"
SRC_URI[sha256sum] = "94196bb5a8e6ee59ba454fdd2a36b3067a3ff211b7f488f23ff885e252d0fa2f"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_scan_unifier-0.7.0-1"

inherit catkin
