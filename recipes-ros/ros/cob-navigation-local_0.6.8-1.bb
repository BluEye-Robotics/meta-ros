DESCRIPTION = "This package holds config and launch files for running the"
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-navigation-config dwa-local-planner move-base"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation_local/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9bff61bc18c39a03358a440fe84f1e1b"
SRC_URI[sha256sum] = "cc23203a1c418f921e3ccd70f2dda1135847da9b94862d7cd9dffed9c187b029"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation_local-0.6.8-1"

inherit catkin
