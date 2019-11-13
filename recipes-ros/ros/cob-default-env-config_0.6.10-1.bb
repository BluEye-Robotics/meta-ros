DESCRIPTION = "This package contains configuration files for the default environments for Care-O-bot supported by IPA."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_environments-release/archive/release/melodic/cob_default_env_config/0.6.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f77bc47ce705a3a0fd76e6d5fb23a6cd"
SRC_URI[sha256sum] = "367b393e0eaba908fab4e6cca65b1cb1c7448c3762558ae0e5131b1e9eaf02e1"

ROS_SPN = "cob_environments"
S = "${WORKDIR}/cob_environments-release-release-melodic-cob_default_env_config-0.6.10-1"

inherit catkin
