DESCRIPTION = "Library to compute SIFT features"
AUTHOR = "zerofrog"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "python-numpy subversion mk boost rosboost-cfg rospack roslib python-numpy boost"

RDEPENDS_${PN} = "python-numpy boost"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/libsiftfast/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c1e880576f4fb4b9e6ca90a1705bb033"
SRC_URI[sha256sum] = "ca3a75a0f18b137f41486124251c3fc8319bbe4b7b6b959662f46067dffe6457"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-libsiftfast-2.1.11-0"

inherit catkin
