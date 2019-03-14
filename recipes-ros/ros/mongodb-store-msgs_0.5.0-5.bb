DESCRIPTION = "The mongodb_store_msgs package"
AUTHOR = "Nick Hawes"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin message-generation actionlib-msgs actionlib message-runtime message-generation actionlib-msgs actionlib"

RDEPENDS_${PN} = "message-runtime message-generation actionlib-msgs actionlib"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_store_msgs/0.5.0-5.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fe6d33b0aecf4d674fe974fbf96ae7e3"
SRC_URI[sha256sum] = "b5df2309a7ca62a19b97e73cf22e30ccf3e8b320ef40e8faf07f9ed144e77e90"

ROS_SPN = "mongodb_store"
S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_store_msgs-0.5.0-5"

inherit catkin
