DESCRIPTION = "Bundle python requirements in a catkin package via virtualenv."
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "python-enum34 python-packaging python-virtualenv python3-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/locusrobotics/catkin_virtualenv-release/archive/release/melodic/catkin_virtualenv/0.2.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8801268fc7df8d4075d108981e047651"
SRC_URI[sha256sum] = "974f1a8e2421b2e1a2d156c81f204873236e9f2df112a058d175f3335ca2df98"

S = "${WORKDIR}/catkin_virtualenv-release-release-melodic-catkin_virtualenv-0.2.2-0"

inherit catkin
