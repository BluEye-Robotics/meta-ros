DESCRIPTION = "rqt is a Qt-based framework for GUI development for ROS. It consists of three parts/metapackages"
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rqt-gui rqt-gui-cpp rqt-gui-py"

RDEPENDS_${PN} = "rqt-gui rqt-gui-cpp rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/melodic/rqt/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "744a89852f7849b5fc83345f45d7acb3"
SRC_URI[sha256sum] = "0838063390001fcb552096bd5a6827aae9bb3105855cbdf0c2a3105a25851e67"

S = "${WORKDIR}/rqt-release-release-melodic-rqt-0.5.0-0"

inherit catkin
