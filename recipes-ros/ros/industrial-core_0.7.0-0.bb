DESCRIPTION = "ROS-Industrial core stack contains packages and libraries for supporing industrial systems"
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "simple-message industrial-msgs industrial-robot-client industrial-robot-simulator industrial-deprecated industrial-utils industrial-trajectory-filters"

RDEPENDS_${PN} = "simple-message industrial-msgs industrial-robot-client industrial-robot-simulator industrial-deprecated industrial-utils industrial-trajectory-filters"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_core/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6dd4291ebf8442e3af0c328b3b440fd7"
SRC_URI[sha256sum] = "bf63fe4b823d57a1ea8970db34788b07979c6b6ac549c0dcf587bee582f9798b"

S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_core-0.7.0-0"

inherit catkin
