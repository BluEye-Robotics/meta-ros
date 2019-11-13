DESCRIPTION = "This package published a laser scan message out of a Sick LMS1xx laser scanner. 	This version is made by fusion of ipa320/RCPRG_laser_drivers and ipa320/libLMS1xx repository. This package shuld have clearer structure and be easier to install."
AUTHOR = "Konrad Banachowicz"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost diagnostic-msgs roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_sick_lms1xx/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "976a4c4f3b1bbd762f8bbdb432b23aff"
SRC_URI[sha256sum] = "9a5663cfaf320c905d1b5ba75e4816a63d3fa59df567ca6892005b57a22ac92f"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_sick_lms1xx-0.7.1-1"

inherit catkin
