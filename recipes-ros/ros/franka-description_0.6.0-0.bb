DESCRIPTION = "franka_description contains URDF files and meshes of Franka Emika robots"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_description/0.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d39c9dd2592954db44591abdeff78f10"
SRC_URI[sha256sum] = "06d66f1cfccb5d012babe67314e1f34870c7f272a15b6d14c83701f514f0e18f"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_description-0.6.0-0"

inherit catkin
