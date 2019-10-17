DESCRIPTION = "The cob_control_mode_adapter package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost controller-manager-msgs roscpp roslint std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_control_mode_adapter/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f816fb98cd58495ee5d72a33641ce9fc"
SRC_URI[sha256sum] = "5266877e15d7bb66f1fd638bbe5657b505af1fa01e75ae9c97946c91d8243ce6"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_control_mode_adapter-0.8.0-1"

inherit catkin
