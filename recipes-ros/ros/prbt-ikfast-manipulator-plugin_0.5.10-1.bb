DESCRIPTION = "The prbt_ikfast_manipulator_plugin package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "eigen-conversions liblapack-dev moveit-core pluginlib roscpp tf2-eigen tf2-kdl"

RDEPENDS_${PN} = "eigen-conversions liblapack-dev moveit-core pluginlib roscpp tf2-kdl"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_ikfast_manipulator_plugin/0.5.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "813a32268a9a5195bd0dbc2e3b3f2e78"
SRC_URI[sha256sum] = "97b205262d1743f3ec62927de46035e6abdd6383fb20ad4cf9e0e3d8d5630aee"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_ikfast_manipulator_plugin-0.5.10-1"

inherit catkin
