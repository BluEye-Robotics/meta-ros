DESCRIPTION = "This package provides a URDF model of WAM-V"
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/wamv_description/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1419bb22ccf3d8270904929ed44b4c76"
SRC_URI[sha256sum] = "5bbe5d0b1c2b60abcab2525119219cf28f20b962132593003c885efddb0bbbeb"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-wamv_description-1.0.1-0"

inherit catkin
