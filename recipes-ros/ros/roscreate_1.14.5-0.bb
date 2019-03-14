DESCRIPTION = "roscreate contains a tool that assists in the creation of ROS filesystem resources. It provides:"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg roslib"

RDEPENDS_${PN} = "python-rospkg roslib"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roscreate/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3df1dc5eebc3b0bd8dfe3a15a7d9a389"
SRC_URI[sha256sum] = "eca0e64c8e34e27186163eec89c48bcfcc0a6811f480b9ae8144857c00aaccfd"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roscreate-1.14.5-0"

inherit catkin
