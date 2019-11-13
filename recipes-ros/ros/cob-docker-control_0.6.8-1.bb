DESCRIPTION = "Autonomous docking"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_substitute-release/archive/release/melodic/cob_docker_control/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6332ac993116b864ba0ce2cd1d9d88f4"
SRC_URI[sha256sum] = "1082dfa38de002e21fee734a6e8f2606d35ed961e990897ae4de27aa4e352413"

ROS_SPN = "cob_substitute"
S = "${WORKDIR}/cob_substitute-release-release-melodic-cob_docker_control-0.6.8-1"

inherit catkin
