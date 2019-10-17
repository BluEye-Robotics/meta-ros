DESCRIPTION = "cob_mapping_slam holds launch files for running SLAM using the"
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-navigation-global gmapping"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_mapping_slam/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bc00d58ff7ae8f88479f96013b088e97"
SRC_URI[sha256sum] = "dd9ad4281ab761c03afbf4e9bc19ba6a258ed49558a6e7735043768f6f3f6b12"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_mapping_slam-0.6.8-1"

inherit catkin
