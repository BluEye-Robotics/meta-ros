DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize ROS messages which type is unknown at compilation time."
AUTHOR = "Davide Faconti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roscpp-serialization rostime roscpp roscpp-serialization rostime"

RDEPENDS_${PN} = "roscpp roscpp-serialization rostime"

SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/melodic/ros_type_introspection/2.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc0651f15d5fcfd7ce842b39031989f9"
SRC_URI[sha256sum] = "c3b138a3033791db8cf0b160fe79dddd40410f3bf7a35f82fed698daa30bcf0b"

S = "${WORKDIR}/ros_type_introspection-release-release-melodic-ros_type_introspection-2.0.4-1"

inherit catkin
