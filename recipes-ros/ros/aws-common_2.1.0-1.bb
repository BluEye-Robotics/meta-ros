DESCRIPTION = "Common AWS SDK utilities, intended for use by ROS packages using the AWS SDK"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "ros-environment zlib  curl openssl"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/aws_common-release/archive/release/melodic/aws_common/2.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "67dc81d9b648657a2f73629313983b12"
SRC_URI[sha256sum] = "eac5a55756b1eb20e37a7b38217345fdae6b4fa24c142e983c177a35f3d3b557"

S = "${WORKDIR}/aws_common-release-release-melodic-aws_common-2.1.0-1"

inherit catkin
