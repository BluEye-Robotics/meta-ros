DESCRIPTION = "cob_phidgets"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation libphidgets roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_phidgets/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5fb48249ce0184a396b954c60b2e7ccc"
SRC_URI[sha256sum] = "8b0223f8f93a58d2c702abb0733ac88b6d18528014a1b89fc9c52ee7cbf77f81"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_phidgets-0.7.1-1"

inherit catkin
