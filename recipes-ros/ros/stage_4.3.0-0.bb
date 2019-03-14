DESCRIPTION = "Mobile robot simulator http://rtv. github. com/Stage"
AUTHOR = "Richard Vaughan"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "gtk2 libfltk-dev libjpeg libtool  catkin libfltk-dev gtk2 libjpeg"

RDEPENDS_${PN} = "catkin libfltk-dev gtk2 libjpeg"

SRC_URI = "https://github.com/ros-gbp/stage-release/archive/release/melodic/stage/4.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1f11e6c8f902c20bb6d216091a8189be"
SRC_URI[sha256sum] = "3c72bba7242ecd98b26f177e4227aef06ec85915f196ee88ec6103be4dfb492d"

S = "${WORKDIR}/stage-release-release-melodic-stage-4.3.0-0"

inherit catkin
