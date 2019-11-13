DESCRIPTION = "The mongodb_store_msgs package"
AUTHOR = "Nick Hawes"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin message-generation actionlib-msgs actionlib message-runtime message-generation actionlib-msgs actionlib"

RDEPENDS_${PN} = "message-runtime message-generation actionlib-msgs actionlib"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_store_msgs/0.5.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6558173de1398ffe5a4515904d89e7d4"
SRC_URI[sha256sum] = "9e04a9e03d5d12af73025911fbc85aa0ba7fc03b0e44b3bc6247df1d39fb7526"

ROS_SPN = "mongodb_store"
S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_store_msgs-0.5.2-1"

inherit catkin
