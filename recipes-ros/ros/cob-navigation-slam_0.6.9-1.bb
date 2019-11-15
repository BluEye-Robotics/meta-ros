DESCRIPTION = "This package provides launch files for running"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-navigation-config cob-navigation-global cob-mapping-slam"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation_slam/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "267c3830a071b688ee60b4fb8a1264d0"
SRC_URI[sha256sum] = "d25f980fdf5c246009e81e40ed2692c4b4a49b4db1b8b178f083689e3f5edcfa"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation_slam-0.6.9-1"

inherit catkin
