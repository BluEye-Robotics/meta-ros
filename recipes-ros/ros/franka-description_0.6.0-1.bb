DESCRIPTION = "franka_description contains URDF files and meshes of Franka Emika robots"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_description/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f0ceec6f6f0274a88ccdd85609276d9a"
SRC_URI[sha256sum] = "2219c2f91c728564ad20606258a024b4e8523f0c1599017c20ac9a1c3a1354bb"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_description-0.6.0-1"

inherit catkin
