DESCRIPTION = "marti_data_structures"
AUTHOR = "Kris Kozak"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/marti_data_structures/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2eb428950763848e144c43eaad3787a9"
SRC_URI[sha256sum] = "edac18a828880daf01342f106afc1f750ffe108a85bcbecdca83f37d1fcaa240"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-marti_data_structures-2.10.0-1"

inherit catkin
