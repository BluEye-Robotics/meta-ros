DESCRIPTION = "The prbt_ikfast_manipulator_plugin package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "moveit-core liblapack-dev roscpp tf2-kdl pluginlib moveit-core liblapack-dev roscpp tf2-kdl pluginlib"

RDEPENDS_${PN} = "moveit-core liblapack-dev roscpp tf2-kdl pluginlib"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_ikfast_manipulator_plugin/0.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fe3603ddada4a8058c2e4ec794db776b"
SRC_URI[sha256sum] = "7af5fbac9ef84b4c58661c8cc505beff584aa585b6732a4f43c0bf785ef8b89f"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_ikfast_manipulator_plugin-0.5.2-0"

inherit catkin
