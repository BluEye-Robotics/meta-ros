DESCRIPTION = "AWS Kinesis stream management library intended for use with the Kinesis Video Producer SDK"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common boost curl openssl log4cplus"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/kinesis_manager-release/archive/release/melodic/kinesis_manager/2.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "427cd7c27000dd359e4914706b920285"
SRC_URI[sha256sum] = "72f3249e68e58cec6b9adcb8d66d73f2effa3386bfef0a41c8734a8041a3d057"

S = "${WORKDIR}/kinesis_manager-release-release-melodic-kinesis_manager-2.0.1-1"

inherit catkin
