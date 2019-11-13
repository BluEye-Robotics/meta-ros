DESCRIPTION = "cob_android_settings"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/melodic/cob_android_settings/0.1.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "910ea33d70865e6502fec7e14ca080ab"
SRC_URI[sha256sum] = "59602692b35e9a17cc5379696012c86046d51533d3f7900e822ef5b1316336e5"

ROS_SPN = "cob_android"
S = "${WORKDIR}/cob_android-release-release-melodic-cob_android_settings-0.1.6-1"

inherit catkin
