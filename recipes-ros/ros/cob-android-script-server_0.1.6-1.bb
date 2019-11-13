DESCRIPTION = "cob_android_script_server"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy cob-android-msgs cob-script-server"

SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/melodic/cob_android_script_server/0.1.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7b7e3b09dc29aa01661b2dbc0f672f55"
SRC_URI[sha256sum] = "ea5eb372ef9f8f09cc5e3526ea3a2f49559b7cff6cd83e9a800fffecbf1b825a"

ROS_SPN = "cob_android"
S = "${WORKDIR}/cob_android-release-release-melodic-cob_android_script_server-0.1.6-1"

inherit catkin
