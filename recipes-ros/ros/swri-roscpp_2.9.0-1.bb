DESCRIPTION = "swri_roscpp"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-updater dynamic-reconfigure marti-common-msgs nav-msgs roscpp std-msgs std-srvs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_roscpp/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "860ce7606fa6e14bbc8c64391741d14a"
SRC_URI[sha256sum] = "970ca3ddeb6fe30b9b2cf14fd33e104fb6d9cead6612545f347ae0b09a58f84f"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_roscpp-2.9.0-1"

inherit catkin
