DESCRIPTION = "The urdf_test package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1fcc2f243daac9b962ca04b90988c4f3"

DEPENDS = "rospy"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/pal-gbp/urdf_test-release/archive/release/melodic/urdf_test/1.0.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a3e76d4491f1f5d440ce433c52441c40"
SRC_URI[sha256sum] = "0c218b7644479fe4c625fd32883d1e45d945f3662f73152e60e45bbf3cabc8b0"

S = "${WORKDIR}/urdf_test-release-release-melodic-urdf_test-1.0.4-0"

inherit catkin
