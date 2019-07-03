DESCRIPTION = "roscreate contains a tool that assists in the creation of ROS filesystem resources. It provides:"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg roslib"

RDEPENDS_${PN} = "python-rospkg roslib"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roscreate/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3019bfc9d34e7859acfefe11f071e302"
SRC_URI[sha256sum] = "00feca079aa2df6b49f19098c964312824216bffc015e1d64d1960df066ddcc4"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roscreate-1.14.6-0"

inherit catkin
