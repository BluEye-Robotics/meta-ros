DESCRIPTION = "roscreate contains a tool that assists in the creation of ROS filesystem resources. It provides:"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python-rospkg roslib"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roscreate/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b3291e2dd257cfa03aae08a7f366520"
SRC_URI[sha256sum] = "784ad70a36afb22b533a74fec2158e5494c083ae4348aec48e5889435e71af5c"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roscreate-1.14.7-1"

inherit catkin
