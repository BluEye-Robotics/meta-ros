DESCRIPTION = "Python implementation of the URDF parser."
AUTHOR = "Thomas Moulard"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy python-lxml python-pyyaml"

SRC_URI = "https://github.com/ros-gbp/urdfdom_py-release/archive/release/melodic/urdfdom_py/0.4.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49f74d86f53f65c557fc4d164aaae6ce"
SRC_URI[sha256sum] = "c81a72fcf704300f049e61307f657235ae499bab71460f45d72fd54cacc53e40"

S = "${WORKDIR}/urdfdom_py-release-release-melodic-urdfdom_py-0.4.1-2"

inherit catkin
