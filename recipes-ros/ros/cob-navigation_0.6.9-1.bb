DESCRIPTION = "The cob_navigation stack provides different navigation packages for"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-linear-nav cob-mapping-slam cob-map-accessibility-analysis cob-navigation-config cob-navigation-global cob-navigation-local cob-navigation-slam"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e14908bf8fd9cb8708c4821e5836cc46"
SRC_URI[sha256sum] = "65e5a45fec4dc4691ea3c35679b2a4cccbbca3e9691a5f458618d580af24b732"

S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation-0.6.9-1"

inherit catkin
