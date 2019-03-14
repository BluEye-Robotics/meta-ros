DESCRIPTION = "This package contains standard capability interfaces, which describe common robot capabilities in terms of ROS concepts such as topics, services, actions, and parameters."
AUTHOR = "William Woodall"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/std_capabilities-release/archive/release/melodic/std_capabilities/0.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bde224c5aa3b597920881314f5863dfc"
SRC_URI[sha256sum] = "56846414a12f4f667aec42eaef1c602c355854fdaa729692117961e54d94a9b6"

S = "${WORKDIR}/std_capabilities-release-release-melodic-std_capabilities-0.1.0-0"

inherit catkin
