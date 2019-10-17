DESCRIPTION = "The ros_introspection package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rosmsg python3-requests"

SRC_URI = "https://github.com/wu-robotics/roscompile-release/archive/release/melodic/ros_introspection/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "39b5c4c640370c9f1d03b3e23523d4b8"
SRC_URI[sha256sum] = "becacb2e9cb821bffb018fe5bb49612b59152cd46067ab47a1fa5fbce2d9443a"

ROS_SPN = "roscompile"
S = "${WORKDIR}/roscompile-release-release-melodic-ros_introspection-1.0.1-0"

inherit catkin
