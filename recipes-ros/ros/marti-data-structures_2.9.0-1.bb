DESCRIPTION = "marti_data_structures"
AUTHOR = "Kris Kozak"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/marti_data_structures/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "224dff8cfa59f8da4362a2f78b4fdd9f"
SRC_URI[sha256sum] = "cb65a4980169161606767101cdfd1fe51a4c0b7cb6e508a6df459c5476b5063a"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-marti_data_structures-2.9.0-1"

inherit catkin
