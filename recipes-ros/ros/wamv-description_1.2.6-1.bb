DESCRIPTION = "This package provides a URDF model of WAM-V"
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/wamv_description/1.2.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "90746e52007da6aea5fda3e22e975670"
SRC_URI[sha256sum] = "bc8a86b9725be627ecc3453e78d119966fb0a443f1167694bfc71715f243250a"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-wamv_description-1.2.6-1"

inherit catkin
