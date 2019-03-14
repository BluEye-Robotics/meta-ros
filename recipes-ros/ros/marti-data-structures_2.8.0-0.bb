DESCRIPTION = "marti_data_structures"
AUTHOR = "Kris Kozak"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/marti_data_structures/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33d630854fefbe4f8e69b99337064c9d"
SRC_URI[sha256sum] = "cab974488d36c22553cd9669dd3b1bd9de726fcc26d07131557d022f68f8713f"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-marti_data_structures-2.8.0-0"

inherit catkin
