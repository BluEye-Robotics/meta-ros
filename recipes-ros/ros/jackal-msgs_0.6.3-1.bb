DESCRIPTION = "Messages exclusive to Jackal, especially for representing low-level motor commands and sensors."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/clearpath-gbp/jackal-release/archive/release/melodic/jackal_msgs/0.6.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "732676a514da662ec037fcf3ffa16afc"
SRC_URI[sha256sum] = "4be5567160fa88f461cf4319ebdbd28ea67a3060cb7bb41fcf3dfadd4396c9ef"

ROS_SPN = "jackal"
S = "${WORKDIR}/jackal-release-release-melodic-jackal_msgs-0.6.3-1"

inherit catkin
