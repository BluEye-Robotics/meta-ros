DESCRIPTION = "This package provides documentation on common interface conventions for drive-by-wire systems."
AUTHOR = "Elliot Johnson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_dbw_interface/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a7a9e9b7da0786ae21d16c0695ceedd0"
SRC_URI[sha256sum] = "6bce2f871999729f20292876ca0fa9f8ea6e707c3de689b99ac2ef34ad4075e7"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_dbw_interface-2.9.0-1"

inherit catkin
