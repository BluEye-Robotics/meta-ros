DESCRIPTION = "ROS-Industrial core stack contains packages and libraries for supporing industrial systems"
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "simple-message industrial-msgs industrial-robot-client industrial-robot-simulator industrial-deprecated industrial-utils industrial-trajectory-filters"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_core/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0e51ee906e95eca57ad09904a75d55e2"
SRC_URI[sha256sum] = "db3b52e778e5cdc9a97854a82b142a6322dd38cb34fce0d57eb16ce208fb4f07"

S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_core-0.7.1-1"

inherit catkin
