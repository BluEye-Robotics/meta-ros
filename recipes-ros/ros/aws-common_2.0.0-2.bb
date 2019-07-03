DESCRIPTION = "Common AWS SDK utilities, intended for use by ROS packages using the AWS SDK"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin ros-environment zlib  curl openssl"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/aws_common-release/archive/release/melodic/aws_common/2.0.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6a8f3e28026b699a24faf5cd38ed9c58"
SRC_URI[sha256sum] = "fd9f9814aef06e687d94c1158f8f401e035005b187e8e22321567cf5db602dcd"

S = "${WORKDIR}/aws_common-release-release-melodic-aws_common-2.0.0-2"

inherit catkin
