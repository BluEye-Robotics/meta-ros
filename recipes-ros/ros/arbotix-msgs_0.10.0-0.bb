DESCRIPTION = "Messages and Services definitions for the ArbotiX."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs message-runtime"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_msgs/0.10.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "829637f9a5d2b28ac8fcd2cf50b79cbf"
SRC_URI[sha256sum] = "4c30092a42cad55c7ed008b877d72fa55f90fd899352daa35e4e1bf64797c092"

ROS_SPN = "arbotix"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix_msgs-0.10.0-0"

inherit catkin
