DESCRIPTION = "tf2_geometry_msgs"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-orocos-kdl geometry-msgs orocos-kdl tf2 tf2-ros"

RDEPENDS_${PN} = "python-orocos-kdl"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_geometry_msgs/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3235e0cf77e3907079ca67a08989c60d"
SRC_URI[sha256sum] = "f1516df538999a5fb7cb8eeaf71636c9572bba758adac8cdafbf5446918b7bbc"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_geometry_msgs-0.6.5-0"

inherit catkin
