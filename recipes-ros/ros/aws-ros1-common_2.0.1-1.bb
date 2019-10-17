DESCRIPTION = "Common utilities for ROS1 nodes using Amazon Web Services"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/aws_ros1_common-release/archive/release/melodic/aws_ros1_common/2.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f0f5ee31af7dfba8b369fb55106b2ee1"
SRC_URI[sha256sum] = "c4a4208d835285e1c0301cc0269f3915962c6fc14631b6fcb8cc8dd08a83ba07"

S = "${WORKDIR}/aws_ros1_common-release-release-melodic-aws_ros1_common-2.0.1-1"

inherit catkin
