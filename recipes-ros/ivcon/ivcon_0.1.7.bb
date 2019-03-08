DESCRIPTION = "Mesh Conversion Utility used to generate '.iv' files from '.stl' files."
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

SRC_URI = "https://github.com/ros-gbp/ivcon-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6461190b13a21ff2ea19f1b307b5ef47"
SRC_URI[sha256sum] = "3d75737c8d6fc30837c9bf86ccfaa415e9933d1202718ab66602b70f52fb0a14"

inherit catkin
