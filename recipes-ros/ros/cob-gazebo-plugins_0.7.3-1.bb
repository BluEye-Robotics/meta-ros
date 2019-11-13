DESCRIPTION = "cob_gazebo_plugins meta-package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-gazebo-ros-control"

SRC_URI = "https://github.com/ipa320/cob_gazebo_plugins-release/archive/release/melodic/cob_gazebo_plugins/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "376009028dd85ce7b5d9998d1cf6f90d"
SRC_URI[sha256sum] = "3a73bcd2de6ec60706da22c0f39ade36c2cc02c1cd51f6771b38be9ca7fd3770"

S = "${WORKDIR}/cob_gazebo_plugins-release-release-melodic-cob_gazebo_plugins-0.7.3-1"

inherit catkin
