DESCRIPTION = "This package holds config and launch files for running the"
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "amcl cob-default-env-config cob-linear-nav cob-navigation-config cob-scan-unifier dwa-local-planner map-server move-base  topic-tools"

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_navigation_global/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ad3a73f11b56a05049892abdd6400ae8"
SRC_URI[sha256sum] = "687344547e320f8aeaac6a09d6ef92b32d7b286ffd56483230f604c327e54129"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_navigation_global-0.6.8-1"

inherit catkin
