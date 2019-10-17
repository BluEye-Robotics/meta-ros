DESCRIPTION = "Common headers for neonavigation meta-package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation_common/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "88a149b8cf8b384eae7425fa732f2599"
SRC_URI[sha256sum] = "594324f308f758a0cf403d4843f93d4c352d1dbc9caf2cf9cc9aa05c3424f7b6"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation_common-0.4.3-1"

inherit catkin
