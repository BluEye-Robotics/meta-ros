DESCRIPTION = "roscpp is a C++ implementation of ROS. It provides a"
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common message-generation pkgconfig rosconsole roscpp-serialization roscpp-traits rosgraph-msgs roslang rostime std-msgs xmlrpcpp cpp-common message-runtime rosconsole roscpp-serialization roscpp-traits rosgraph-msgs rostime std-msgs xmlrpcpp"

RDEPENDS_${PN} = "cpp-common message-runtime rosconsole roscpp-serialization roscpp-traits rosgraph-msgs rostime std-msgs xmlrpcpp"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/roscpp/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7792d7959dd6ea15b1e2a1daeb4da79"
SRC_URI[sha256sum] = "aafa1e50ff61f428b3cdf7158129b8b09b4bd7aae6aee553f6a5c8251eae1806"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-roscpp-1.14.3-0"

inherit catkin
