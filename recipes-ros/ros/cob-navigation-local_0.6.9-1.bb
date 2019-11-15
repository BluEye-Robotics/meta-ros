DESCRIPTION = "This package holds config and launch files for running the"
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-navigation-config dwa-local-planner move-base"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation_local/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "60d46e6c2ac5c84d330046970c3346a0"
SRC_URI[sha256sum] = "f1546309f37a1c9f9b5978f5d09bc7bb76b7a3c7c84fd6393741f3c4d5a1507d"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation_local-0.6.9-1"

inherit catkin
