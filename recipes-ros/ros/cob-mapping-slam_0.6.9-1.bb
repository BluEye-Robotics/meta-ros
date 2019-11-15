DESCRIPTION = "cob_mapping_slam holds launch files for running SLAM using the"
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-navigation-global gmapping"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_mapping_slam/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ffe7859f3724c6f8deb2a699faa5314"
SRC_URI[sha256sum] = "eccdc39eae7f62e1801a33b22c541eca4d9b035b053c5dca897390f452795e88"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_mapping_slam-0.6.9-1"

inherit catkin
