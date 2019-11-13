DESCRIPTION = "cob_android_resource_server"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy"

SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/melodic/cob_android_resource_server/0.1.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "20cd2c2791a894e71136894c6210e41f"
SRC_URI[sha256sum] = "aabbcf56633153105deb9131389d793848906c458654e5bed84206b0cd7106b8"

ROS_SPN = "cob_android"
S = "${WORKDIR}/cob_android-release-release-melodic-cob_android_resource_server-0.1.6-1"

inherit catkin
