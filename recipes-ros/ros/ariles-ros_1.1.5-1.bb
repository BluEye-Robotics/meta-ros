DESCRIPTION = "Catkin package Ariles serialization/configuration library"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp libeigen yaml-cpp boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/asherikov/ariles-release/archive/release/melodic/ariles_ros/1.1.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "501e2d927879acd3208376b0e1ff83f2"
SRC_URI[sha256sum] = "754b8f19a0eff587ad0817975739d9e6451007848376ae6171b8a02277c61a2d"

S = "${WORKDIR}/ariles-release-release-melodic-ariles_ros-1.1.5-1"

inherit catkin
