DESCRIPTION = "cob_android_msgs"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib actionlib-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/melodic/cob_android_msgs/0.1.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d60bc1d18a9ce0fd282fd5da6b348d0e"
SRC_URI[sha256sum] = "506bb55d787b9cfc23d15fbf27abbe8bfa6d5c57e24b137e47e80c7dbe4287db"

ROS_SPN = "cob_android"
S = "${WORKDIR}/cob_android-release-release-melodic-cob_android_msgs-0.1.6-1"

inherit catkin
