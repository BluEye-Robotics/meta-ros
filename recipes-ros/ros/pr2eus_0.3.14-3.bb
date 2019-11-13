DESCRIPTION = "pr2eus"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roseus euscollada pr2-msgs pr2-controllers-msgs pr2-description pr2-mechanism-msgs control-msgs move-base-msgs nav-msgs dynamic-reconfigure sound-play rosgraph-msgs roseus euscollada pr2-msgs pr2-controllers-msgs pr2-description pr2-mechanism-msgs control-msgs move-base-msgs nav-msgs dynamic-reconfigure sound-play"

RDEPENDS_${PN} = "roseus euscollada pr2-msgs pr2-controllers-msgs pr2-description pr2-mechanism-msgs control-msgs move-base-msgs nav-msgs dynamic-reconfigure sound-play"

SRC_URI = "https://github.com/tork-a/jsk_pr2eus-release/archive/release/melodic/pr2eus/0.3.14-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec08d08c73686361ddccece5a60ec7e9"
SRC_URI[sha256sum] = "893fd05c7b1c9fce063437fe74f2eae8c9fe750a2a85f5bac5413fafd88dd710"

ROS_SPN = "jsk_pr2eus"
S = "${WORKDIR}/jsk_pr2eus-release-release-melodic-pr2eus-0.3.14-3"

inherit catkin
