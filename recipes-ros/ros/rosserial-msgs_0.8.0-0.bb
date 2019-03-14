DESCRIPTION = "Messages for automatic topic configuration using rosserial."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d44ecd4b5a82cae45a08266477642c6e"
SRC_URI[sha256sum] = "8e7997385cc06168097b0d5e56c91155f5a3fea6a28cecbc9ba0d9dc48cad6af"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_msgs-0.8.0-0"

inherit catkin
