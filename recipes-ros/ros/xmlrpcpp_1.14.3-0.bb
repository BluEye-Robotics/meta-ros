DESCRIPTION = "XmlRpc++ is a C++ implementation of the XML-RPC protocol. This version is heavily modified from the package available on SourceForge in order to support roscpp's threading model. As such, we are maintaining our own fork."
AUTHOR = "Chris Morley"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=184dd1523b9a109aead3fbbe0b4262e0"

DEPENDS = "cpp-common rostime"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/xmlrpcpp/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03941521da2f4044e6694cde91df09fd"
SRC_URI[sha256sum] = "d141854dd4371212f6606bfff6f7a44eb1a0292bbcf64cf29f4fed0c0741bc76"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-xmlrpcpp-1.14.3-0"

inherit catkin
