DESCRIPTION = "This package provides documentation on common interface conventions for drive-by-wire systems."
AUTHOR = "Elliot Johnson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_dbw_interface/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21e90133e12363c1cc9efea47549bbdb"
SRC_URI[sha256sum] = "1e3747186a63e5b9d6e0d34de04caa53926f620637766570d6af9fed085fa312"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_dbw_interface-2.8.0-0"

inherit catkin
