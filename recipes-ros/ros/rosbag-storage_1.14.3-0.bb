DESCRIPTION = "This is a set of tools for recording from and playing back ROS message without relying on the ROS client library."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost bzip2 cpp-common console-bridge gpgme openssl pluginlib roscpp-serialization roscpp-traits rostest rostime roslz4 boost bzip2 cpp-common console-bridge gpgme openssl pluginlib roscpp-serialization roscpp-traits rostime roslz4"

RDEPENDS_${PN} = "boost bzip2 cpp-common console-bridge gpgme openssl pluginlib roscpp-serialization roscpp-traits rostime roslz4"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosbag_storage/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f1a872140eb90a1594089e9eadc5fad2"
SRC_URI[sha256sum] = "670edf72be59ce0c5d2fce6df933f1c50895c8351f250f9d192164157c2fc46e"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosbag_storage-1.14.3-0"

inherit catkin
