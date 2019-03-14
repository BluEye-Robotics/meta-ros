DESCRIPTION = "This encapsulates the Qwt dependency for a specific ROS distribution and its Qt version"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/qwt_dependency-release/archive/release/melodic/qwt_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a48078a61292dc15b851070fc7e594c9"
SRC_URI[sha256sum] = "7d171d5a7bb5226de322e8146262b5ca73461ec9c71afc3675c5b353e90e42f5"

S = "${WORKDIR}/qwt_dependency-release-release-melodic-qwt_dependency-1.1.0-0"

inherit catkin
