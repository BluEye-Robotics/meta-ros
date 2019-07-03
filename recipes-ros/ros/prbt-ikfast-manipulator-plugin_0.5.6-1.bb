DESCRIPTION = "The prbt_ikfast_manipulator_plugin package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "eigen-conversions liblapack-dev moveit-core pluginlib roscpp tf2-eigen tf2-kdl"

RDEPENDS_${PN} = "eigen-conversions liblapack-dev moveit-core pluginlib roscpp tf2-kdl"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_ikfast_manipulator_plugin/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aecdb1bd5d195294b90b85a5c3e93843"
SRC_URI[sha256sum] = "5454effca64250fafc0bd2cbdc147e6b848d3f6aadff1f9a271646856561ea19"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_ikfast_manipulator_plugin-0.5.6-1"

inherit catkin
