DESCRIPTION = "The cob_phidget_em_state package"
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs cob-phidgets rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_phidget_em_state/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c04bb59bd200e31a2f95347bc83871bf"
SRC_URI[sha256sum] = "d27b10fff6cb4e8a46923f44a3b505055b0b29bbe5be704fc838bde4a76622a1"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_phidget_em_state-0.7.0-1"

inherit catkin
