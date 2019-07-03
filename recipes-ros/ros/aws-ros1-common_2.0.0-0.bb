DESCRIPTION = "Common utilities for ROS1 nodes using Amazon Web Services"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/aws_ros1_common-release/archive/release/melodic/aws_ros1_common/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6eae0fbff73df6f3d21d1db1276679b0"
SRC_URI[sha256sum] = "34ab3879ab871a990b6b3eb591794dcdc7c62c32ef2687d011db9fdf14fcd354"

S = "${WORKDIR}/aws_ros1_common-release-release-melodic-aws_ros1_common-2.0.0-0"

inherit catkin
