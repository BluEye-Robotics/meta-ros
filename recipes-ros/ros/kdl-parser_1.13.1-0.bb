DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure to represent the kinematic and dynamic parameters of a robot mechanism."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules urdfdom-headers rosconsole orocos-kdl libtinyxml libtinyxml2 urdf urdfdom-headers"

RDEPENDS_${PN} = "rosconsole"

SRC_URI = "https://github.com/ros-gbp/kdl_parser-release/archive/release/melodic/kdl_parser/1.13.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "34bc79b47acd54f70d69e4fee75a1936"
SRC_URI[sha256sum] = "5931eb562bb310633fedf3c2e40b435cfa6a8d25caddb4077c04932c66c2a8a9"

S = "${WORKDIR}/kdl_parser-release-release-melodic-kdl_parser-1.13.1-0"

inherit catkin
