DESCRIPTION = "The mongodb_store_msgs package"
AUTHOR = "Nick Hawes"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin message-generation actionlib-msgs actionlib message-runtime message-generation actionlib-msgs actionlib"

RDEPENDS_${PN} = "message-runtime message-generation actionlib-msgs actionlib"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_store_msgs/0.5.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b08749996486cab50ba104650f8e851e"
SRC_URI[sha256sum] = "075b062cafd0ac8994ea0c176b25a8099b419edc548f94e26ef1b5162a2962bf"

ROS_SPN = "mongodb_store"
S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_store_msgs-0.5.1-2"

inherit catkin
