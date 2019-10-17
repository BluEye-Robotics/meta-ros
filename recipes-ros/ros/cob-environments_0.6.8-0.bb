DESCRIPTION = "This stack holds packages for IPA default environment configuration."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-default-env-config"

SRC_URI = "https://github.com/ipa320/cob_environments-release/archive/release/melodic/cob_environments/0.6.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94586aca9148304f3caaaa144ccb2828"
SRC_URI[sha256sum] = "ff50f816354b9990e71a7ed557e7c3a6df5d513cb6469a7a36367b00396f5c65"

S = "${WORKDIR}/cob_environments-release-release-melodic-cob_environments-0.6.8-0"

inherit catkin
