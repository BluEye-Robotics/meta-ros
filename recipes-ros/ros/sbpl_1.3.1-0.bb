DESCRIPTION = "Search-based planning library (SBPL)."
AUTHOR = "Search-Based Planning Lab"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/sbpl-release/archive/release/melodic/sbpl/1.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1cc8d0b5148187c75d01348aaa399aaf"
SRC_URI[sha256sum] = "9f24887428cc4e548e8cb297b225d952a1085e3c1f555a847350016c21c7cef2"

S = "${WORKDIR}/sbpl-release-release-melodic-sbpl-1.3.1-0"

inherit catkin
