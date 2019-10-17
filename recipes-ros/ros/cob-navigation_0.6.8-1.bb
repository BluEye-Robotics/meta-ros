DESCRIPTION = "The cob_navigation stack provides different navigation packages for"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-linear-nav cob-mapping-slam cob-map-accessibility-analysis cob-navigation-config cob-navigation-global cob-navigation-local cob-navigation-slam"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b07d4b24cf3863e136848a41e2db52ae"
SRC_URI[sha256sum] = "435068ab15f5a5025f58a9bafc10e92096cda1303da2175e28f6e95b948547d3"

S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation-0.6.8-1"

inherit catkin
