DESCRIPTION = "assimp library"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "mk rosbuild git rosboost-cfg boost zlib unzip ca-certificates openssl boost zlib"

RDEPENDS_${PN} = "boost zlib"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/assimp_devel/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "155d507b9cf1b0d94049d00fcfa29c73"
SRC_URI[sha256sum] = "f319e55fcad41526f49375ba1d5c2dff1c0052837e39aa60ca113c28748a3450"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-assimp_devel-2.1.13-1"

inherit catkin
