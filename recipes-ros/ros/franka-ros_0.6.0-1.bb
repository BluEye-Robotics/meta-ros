DESCRIPTION = "franka_ros is a metapackage for all Franka Emika ROS packages"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "franka-control franka-description franka-example-controllers franka-gripper franka-hw franka-msgs franka-visualization panda-moveit-config"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_ros/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b1fc2b4a9e6e0fb076f0b95e5b5857e3"
SRC_URI[sha256sum] = "4d533878ff04e67f95df1bc67a9fd2df096055d8c7d7e4580f0e9f02089bc272"

S = "${WORKDIR}/franka_ros-release-release-melodic-franka_ros-0.6.0-1"

inherit catkin
