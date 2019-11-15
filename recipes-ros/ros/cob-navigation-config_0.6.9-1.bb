DESCRIPTION = "This package holds common configuration files for running the"
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation_config/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "150337b395e834ee344493968a51de66"
SRC_URI[sha256sum] = "f25c2724eec052454305a4cc9b00d2b482db6f45598897c8fa77653101c1ba19"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation_config-0.6.9-1"

inherit catkin
