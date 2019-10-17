DESCRIPTION = "This package published a laser scan message out of a Sick S300 laser scanner."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost diagnostic-msgs roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_sick_s300/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f60baf4cde4b36fc0c818a8a0724f80f"
SRC_URI[sha256sum] = "1527a7c8d07a4a21995871464aa7ec36c18eda19c8acdf553a01ad56a559d2bd"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_sick_s300-0.7.0-1"

inherit catkin
