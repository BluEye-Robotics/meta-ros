DESCRIPTION = "A library for ROS parameter assertions"
AUTHOR = "Oswin So"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/RoboJackets/rj-ros-common-release/archive/release/melodic/parameter_assertions/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ec68de31e2e9e91af7ea5e5e68cb973"
SRC_URI[sha256sum] = "639173429975b82767392b4c719fff84c22fc31c40aa83b04bcda8b8eeca6df8"

ROS_SPN = "rj-ros-common"
S = "${WORKDIR}/rj-ros-common-release-release-melodic-parameter_assertions-0.1.0-1"

inherit catkin
