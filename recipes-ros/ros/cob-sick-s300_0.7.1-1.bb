DESCRIPTION = "This package published a laser scan message out of a Sick S300 laser scanner."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost diagnostic-msgs roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_sick_s300/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e6f7b6cd36102a3220b9723d54ac14e8"
SRC_URI[sha256sum] = "57743ae986fda4029b928586d172be3bad95bd8bf60e13522cbfd974584a8d86"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_sick_s300-0.7.1-1"

inherit catkin
