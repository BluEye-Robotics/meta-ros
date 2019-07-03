DESCRIPTION = "This package contains configuration files for the default environments for Care-O-bot supported by IPA."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_environments-release/archive/release/melodic/cob_default_env_config/0.6.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d38fb7833dfb000a2abe29e7fa423a89"
SRC_URI[sha256sum] = "287d83e86a65dcd11bf0e3a84f98617e7b4120052814846fca4f8053ecd622d7"

ROS_SPN = "cob_environments"
S = "${WORKDIR}/cob_environments-release-release-melodic-cob_default_env_config-0.6.8-0"

inherit catkin
