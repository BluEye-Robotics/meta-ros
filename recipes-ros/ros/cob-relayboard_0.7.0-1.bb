DESCRIPTION = "cob_relayboard"
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-msgs roscpp std-msgs"

RDEPENDS_${PN} = "rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_relayboard/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa15725acfb8aecf13eed6e233db5210"
SRC_URI[sha256sum] = "49facd7caf59cfd6491317d2fd7a985e5400552d8582ae7e2f312ef5fc3da760"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_relayboard-0.7.0-1"

inherit catkin
