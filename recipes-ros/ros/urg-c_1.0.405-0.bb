DESCRIPTION = "The urg_c package"
AUTHOR = "Satofumi Kamimura"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/urg_c-release/archive/release/melodic/urg_c/1.0.405-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f5c5677ed039c6d1a59d40b3d87e78e"
SRC_URI[sha256sum] = "f747da6d3ab437c8a455194bbd9cf64f84798700d7458584c77916f9c479691a"

S = "${WORKDIR}/urg_c-release-release-melodic-urg_c-1.0.405-0"

inherit catkin
