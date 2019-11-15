DESCRIPTION = "This package contains the list of supported robots within the care-o-bot family."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_supported_robots-release/archive/release/melodic/cob_supported_robots/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "029d468c356d2ae5c093a5b1a22e01f3"
SRC_URI[sha256sum] = "32e121b69c9c52d7e09fc882bc115ee2c05e0350da0c8dd5df73450df241ea96"

S = "${WORKDIR}/cob_supported_robots-release-release-melodic-cob_supported_robots-0.6.13-1"

inherit catkin
