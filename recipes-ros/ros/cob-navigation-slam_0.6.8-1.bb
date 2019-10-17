DESCRIPTION = "This package provides launch files for running"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-navigation-config cob-navigation-global cob-mapping-slam"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation_slam/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8706d8dfdb4566f2cc88cf947c8fd3e3"
SRC_URI[sha256sum] = "882e62aec68e93bcb8809da47070e73e90450c250db935ecab9a9638310b6117"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation_slam-0.6.8-1"

inherit catkin
