DESCRIPTION = "hector_gazebo_worlds provides gazebo scenarios used by Team Hector Darmstadt"
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gazebo-ros hector-gazebo-plugins"

RDEPENDS_${PN} = "gazebo-ros hector-gazebo-plugins"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_gazebo_worlds/0.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1f254e4b7c7bb4cc80b04ff603d07d7c"
SRC_URI[sha256sum] = "71ada41731ad64e3a1815c57a0f4ef98f526afaf0decf58eb26745721a39ce5b"

ROS_SPN = "hector_gazebo"
S = "${WORKDIR}/hector_gazebo-release-release-melodic-hector_gazebo_worlds-0.5.1-0"

inherit catkin
