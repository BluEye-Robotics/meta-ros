DESCRIPTION = "Some utility functionality to interact with ROS using roslisp."
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/roslisp_utilities/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1660fe70a71519b68b4044d90eddb28a"
SRC_URI[sha256sum] = "285715fab6f8d3f65174fcc8eead6849d9f69e2c5870a454a96c879b7325f458"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-roslisp_utilities-0.2.12-1"

inherit catkin
