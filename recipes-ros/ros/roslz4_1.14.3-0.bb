DESCRIPTION = "A Python and C++ implementation of the LZ4 streaming format. Large data streams are split into blocks which are compressed using the very fast LZ4 compression algorithm."
AUTHOR = "Ben Charrow"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "lz4 lz4"

RDEPENDS_${PN} = "lz4"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/roslz4/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3478035627981c55b1cbfb4fef7fe41c"
SRC_URI[sha256sum] = "f1cfdca5119fb941e00a174dbd2ad42a577543994efd979e81fd22970ffc7a0e"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-roslz4-1.14.3-0"

inherit catkin
