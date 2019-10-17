DESCRIPTION = ""
AUTHOR = "Levi Armstrong (Southwest Research Institute)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_resources/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49954e2969a3457c74a68281aa7fd1ab"
SRC_URI[sha256sum] = "e21bc080006c798014a924a0974d6e6af9e375c76a336651316936af4231d825"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_resources-1.3.1-1"

inherit catkin
