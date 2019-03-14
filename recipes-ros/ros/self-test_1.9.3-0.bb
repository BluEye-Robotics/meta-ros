DESCRIPTION = "self_test"
AUTHOR = "Kevin Watts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs diagnostic-updater roscpp rostest diagnostic-msgs diagnostic-updater roscpp"

RDEPENDS_${PN} = "diagnostic-msgs diagnostic-updater roscpp"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/self_test/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e27f049aebbde1ee01722a40ce9f24ed"
SRC_URI[sha256sum] = "cf23d9e067a2cf40f2264386a257c0059656e83854509ad42c00b4c037a4d5a8"

ROS_SPN = "diagnostics"
S = "${WORKDIR}/diagnostics-release-release-melodic-self_test-1.9.3-0"

inherit catkin
