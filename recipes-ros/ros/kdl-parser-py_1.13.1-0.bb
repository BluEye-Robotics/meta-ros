DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure to represent the kinematic and dynamic parameters of a robot mechanism."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "orocos-kdl urdf urdfdom-py python-orocos-kdl"

RDEPENDS_${PN} = "urdfdom-py python-orocos-kdl"

SRC_URI = "https://github.com/ros-gbp/kdl_parser-release/archive/release/melodic/kdl_parser_py/1.13.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e0380ca518a1ced4b8de78ba070cebe"
SRC_URI[sha256sum] = "66da27c1d53a445cc5334768a54a2f792df8c46475fe24a91ff486675082c86a"

ROS_SPN = "kdl_parser"
S = "${WORKDIR}/kdl_parser-release-release-melodic-kdl_parser_py-1.13.1-0"

inherit catkin
