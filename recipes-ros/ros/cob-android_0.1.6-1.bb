DESCRIPTION = "cob_android package provides tools for android apps operation."
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-android-msgs cob-android-resource-server cob-android-script-server cob-android-settings"

SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/melodic/cob_android/0.1.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "02f0e156f73f65750fc6f316ca50c41f"
SRC_URI[sha256sum] = "d14eb86dac83a30e8cc4769108244b84d84ca3aa59646e6c660f7f17b46cb99a"

S = "${WORKDIR}/cob_android-release-release-melodic-cob_android-0.1.6-1"

inherit catkin
