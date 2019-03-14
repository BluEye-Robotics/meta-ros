DESCRIPTION = "The pluginlib_tutorials package"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pluginlib roscpp pluginlib roscpp"

RDEPENDS_${PN} = "pluginlib roscpp"

SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/pluginlib_tutorials/0.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b69da7ebfc00a157529fab2e5a8cdbbb"
SRC_URI[sha256sum] = "2a421d7ea4d04ba27c7221abd753f1ebbe040227df1e4c87a3df559064002c17"

ROS_SPN = "common_tutorials"
S = "${WORKDIR}/common_tutorials-release-release-melodic-pluginlib_tutorials-0.1.11-0"

inherit catkin
