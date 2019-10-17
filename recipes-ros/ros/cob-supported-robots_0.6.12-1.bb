DESCRIPTION = "This package contains the list of supported robots within the care-o-bot family."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_supported_robots-release/archive/release/melodic/cob_supported_robots/0.6.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "85614d8199ebb767b038b45726b6d3e7"
SRC_URI[sha256sum] = "4072b48fcfe49cefd9a35ff160fe63c930e3cbd16a59a256ac6701389b794120"

S = "${WORKDIR}/cob_supported_robots-release-release-melodic-cob_supported_robots-0.6.12-1"

inherit catkin
