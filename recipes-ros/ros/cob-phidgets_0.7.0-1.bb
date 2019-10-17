DESCRIPTION = "cob_phidgets"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation libphidgets roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_phidgets/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "44973cc54e13bc5e1f51f907b99ff8c8"
SRC_URI[sha256sum] = "0ede0e6d1c590d499be341247f014cbd870d0d66683956f720b277fc505e7b25"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_phidgets-0.7.0-1"

inherit catkin
