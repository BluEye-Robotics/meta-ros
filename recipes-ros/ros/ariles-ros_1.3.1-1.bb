DESCRIPTION = "Catkin package Ariles serialization/configuration library"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp libeigen yaml-cpp boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/asherikov/ariles-release/archive/release/melodic/ariles_ros/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8a34b0cf4d301b3930f0ef18a0662388"
SRC_URI[sha256sum] = "ba25ae4ed03521009d67be9148fac52f462075a7cf387e4ad30ec34b1276a159"

S = "${WORKDIR}/ariles-release-release-melodic-ariles_ros-1.3.1-1"

inherit catkin
