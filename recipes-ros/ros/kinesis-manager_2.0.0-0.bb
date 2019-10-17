DESCRIPTION = "AWS Kinesis stream management library intended for use with the Kinesis Video Producer SDK"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common boost curl openssl log4cplus"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/kinesis_manager-release/archive/release/melodic/kinesis_manager/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9473b772bb43fac0aa378ee685533b6"
SRC_URI[sha256sum] = "455faeba33ec5a7f671ac3311e0afb2a4a6081da7a36cf5fdddbd83704b95b39"

S = "${WORKDIR}/kinesis_manager-release-release-melodic-kinesis_manager-2.0.0-0"

inherit catkin
