DESCRIPTION = "franka_hw provides hardware interfaces for using Franka Emika research robots with ros_control"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "controller-interface hardware-interface joint-limits-interface libfranka roscpp urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_hw/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "485a7e099f5264a19efffff80058485e"
SRC_URI[sha256sum] = "33ab406de975e57944c4df7879a3e9cc3015e3e44e6acccf5df49bd79220d5aa"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_hw-0.6.0-1"

inherit catkin
