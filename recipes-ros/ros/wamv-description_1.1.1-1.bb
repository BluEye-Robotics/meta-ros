DESCRIPTION = "This package provides a URDF model of WAM-V"
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/wamv_description/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9416e433a111b65d353a5992a76357b"
SRC_URI[sha256sum] = "a8ac88d7422cbf56d9d5171755b5e9a0e5fa886b10f154a58c1c45333c1cb15b"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-wamv_description-1.1.1-1"

inherit catkin
