DESCRIPTION = "C++ ROS message and service generators."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg genmsg"

RDEPENDS_${PN} = "genmsg"

SRC_URI = "https://github.com/ros-gbp/gencpp-release/archive/release/melodic/gencpp/0.6.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c2c2df7d118faa7c60af6465818e4098"
SRC_URI[sha256sum] = "d5b03777119dd51d50536b5e9613f00b0bb7558f363ed7f7358b8ceb8062b154"

S = "${WORKDIR}/gencpp-release-release-melodic-gencpp-0.6.2-0"

inherit catkin
