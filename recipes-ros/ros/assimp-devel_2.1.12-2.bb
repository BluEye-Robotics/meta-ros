DESCRIPTION = "assimp library"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "mk rosbuild git rosboost-cfg boost zlib unzip ca-certificates openssl boost zlib"

RDEPENDS_${PN} = "boost zlib"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/assimp_devel/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "86f658416017089e6d7d15f9a83c4a59"
SRC_URI[sha256sum] = "35553f415ba145a6c90ad40362835778cd08e946699051129cc840511dc6f564"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-assimp_devel-2.1.12-2"

inherit catkin
