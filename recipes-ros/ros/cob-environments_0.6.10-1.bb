DESCRIPTION = "This stack holds packages for IPA default environment configuration."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-default-env-config"

SRC_URI = "https://github.com/ipa320/cob_environments-release/archive/release/melodic/cob_environments/0.6.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ad5d6c4c774db4516f2910b88ed548f"
SRC_URI[sha256sum] = "e3cb6c21bfd6e5961efdfc0784f72a914aad138a464ba557c6e4b44c6fc1d107"

S = "${WORKDIR}/cob_environments-release-release-melodic-cob_environments-0.6.10-1"

inherit catkin
