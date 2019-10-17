DESCRIPTION = "This package provides documentation on common interface conventions for drive-by-wire systems."
AUTHOR = "Elliot Johnson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_dbw_interface/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0dde5e39c206283da85a45de1e498347"
SRC_URI[sha256sum] = "65af3b3003f55aefac82347430e7a760dbe994645aa431b1c983fecfc38fc466"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_dbw_interface-2.10.0-1"

inherit catkin
