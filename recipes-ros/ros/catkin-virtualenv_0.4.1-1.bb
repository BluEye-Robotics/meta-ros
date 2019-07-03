DESCRIPTION = "Bundle python requirements in a catkin package via virtualenv."
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "python-enum34 python-packaging python-virtualenv python3-dev python3-venv rosbash virtualenv"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/locusrobotics/catkin_virtualenv-release/archive/release/melodic/catkin_virtualenv/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4434308b1801517eff1b7b57a884ba58"
SRC_URI[sha256sum] = "1c53b54c0146a9dcfbf181b8634360da78f6ebddfb8cbf661f1836d80e769c19"

S = "${WORKDIR}/catkin_virtualenv-release-release-melodic-catkin_virtualenv-0.4.1-1"

inherit catkin
