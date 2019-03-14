DESCRIPTION = "Standalone Python library for generating ROS message and service data structures for various languages."
AUTHOR = "Troy Straszheim"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-empy"

RDEPENDS_${PN} = "catkin python-empy"

SRC_URI = "https://github.com/ros-gbp/genmsg-release/archive/release/melodic/genmsg/0.5.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8c555c4c9feca08c3e0f2b53d1db1b90"
SRC_URI[sha256sum] = "6398881d14a9653d5fccff7733c2162513814bb14350bd7958c5cc2c36201e9e"

S = "${WORKDIR}/genmsg-release-release-melodic-genmsg-0.5.12-0"

inherit catkin
