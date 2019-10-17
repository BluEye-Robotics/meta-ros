DESCRIPTION = ""
AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute)"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "liblapack-dev moveit-core pluginlib roscpp tf-conversions"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb2400_moveit_plugins/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "31e6e04ed717cb5e98f3c86114287a2c"
SRC_URI[sha256sum] = "40310f77bef824f956946c9f344dc50f62cee49d64ef9af8084c5fadf67a3445"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb2400_moveit_plugins-1.3.1-1"

inherit catkin
