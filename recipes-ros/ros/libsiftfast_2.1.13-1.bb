DESCRIPTION = "Library to compute SIFT features"
AUTHOR = "zerofrog"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "python-numpy subversion mk boost rosboost-cfg rospack roslib python-numpy boost"

RDEPENDS_${PN} = "python-numpy boost"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/libsiftfast/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3988bfb503fd0d59ab8c07b2f912de6b"
SRC_URI[sha256sum] = "34837d3b7a8f0e8255669ca198c652f9c0b3e7363feba149f8c1a60a105819cc"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-libsiftfast-2.1.13-1"

inherit catkin
