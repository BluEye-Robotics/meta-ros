DESCRIPTION = "ROS client nodes for the"
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp tf2-ros vrpn"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/vrpn_client_ros-release/archive/release/melodic/vrpn_client_ros/0.2.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a2d609cace98f82181f039e84185b2a9"
SRC_URI[sha256sum] = "1aab125d405ed53be48b7f49db7594343f35cccfecd3f4ef14571311ff5ae0f2"

S = "${WORKDIR}/vrpn_client_ros-release-release-melodic-vrpn_client_ros-0.2.2-0"

inherit catkin
