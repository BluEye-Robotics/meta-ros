DESCRIPTION = "pr2eus_tutorials"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2eus jsk-pcl-ros pr2eus roseus-tutorials jsk-pcl-ros jsk-interactive-marker"

RDEPENDS_${PN} = "pr2eus roseus-tutorials jsk-pcl-ros jsk-interactive-marker"

SRC_URI = "https://github.com/tork-a/jsk_pr2eus-release/archive/release/melodic/pr2eus_tutorials/0.3.14-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "36443109fa58b208a370b978f33b6e27"
SRC_URI[sha256sum] = "0c93d0988fc81f1157defca391eb97fa1df1b0534fa85bd524053964f06b30ef"

ROS_SPN = "jsk_pr2eus"
S = "${WORKDIR}/jsk_pr2eus-release-release-melodic-pr2eus_tutorials-0.3.14-3"

inherit catkin
