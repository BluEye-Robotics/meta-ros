DESCRIPTION = "marti_nav_msgs"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geographic-msgs geometry-msgs marti-common-msgs sensor-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_nav_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6993a28e58a713d414eb4364ed372b55"
SRC_URI[sha256sum] = "d4e787cb1a9e173eda0759738129af2ec90c286bcc3dcc35b4d622198ed2b917"

ROS_SPN = "marti_messages"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_nav_msgs-0.8.0-0"

inherit catkin
