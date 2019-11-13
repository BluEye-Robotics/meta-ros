DESCRIPTION = "The cob_phidget_em_state package"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs cob-phidgets rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_phidget_em_state/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b8acd16253617b9d5768efb646fd315"
SRC_URI[sha256sum] = "1626f7bce8a701f167fea0972781950c434ef87a3301d667b89df1f7ad3454a2"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_phidget_em_state-0.7.1-1"

inherit catkin
