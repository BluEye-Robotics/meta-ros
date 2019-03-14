DESCRIPTION = "assimp library"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "mk rosbuild git rosboost-cfg boost zlib unzip ca-certificates openssl boost zlib"

RDEPENDS_${PN} = "boost zlib"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/assimp_devel/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a2ef14b7f1d383fb5ebbb8e97c23dceb"
SRC_URI[sha256sum] = "1c486fc48c4770e001309be306cc1e28975e1da17fbbc865967c410df538c9cc"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-assimp_devel-2.1.11-0"

inherit catkin
