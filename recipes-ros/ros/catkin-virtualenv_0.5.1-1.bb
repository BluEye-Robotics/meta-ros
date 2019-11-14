DESCRIPTION = "Bundle python requirements in a catkin package via virtualenv."
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "python-enum34 python-packaging python-virtualenv rosbash virtualenv"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/locusrobotics/catkin_virtualenv-release/archive/release/melodic/catkin_virtualenv/0.5.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3d961763ca141520833d084b71226e54"
SRC_URI[sha256sum] = "af870d6acef78e77b5703742a94ac73334e81a0ef916b5a41d2e0c9fba263d7c"

S = "${WORKDIR}/catkin_virtualenv-release-release-melodic-catkin_virtualenv-0.5.1-1"

inherit catkin
