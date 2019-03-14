DESCRIPTION = "Catkinized gRPC Package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "autoconf libtool rsync git zlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/CogRobRelease/catkin_grpc-release/archive/release/melodic/grpc/0.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6deb0491866113c3b07932bcfbc08801"
SRC_URI[sha256sum] = "c68b25e98a58f726e6d9a86a1a16c943c468e8f1d426781f9086cd31c525e7b2"

S = "${WORKDIR}/catkin_grpc-release-release-melodic-grpc-0.0.10-0"

inherit catkin
