DESCRIPTION = "Messages exclusive to Warthog, especially for representing low-level motor commands and sensors."
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/clearpath-gbp/warthog-release/archive/release/melodic/warthog_msgs/0.1.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8125325d565e30cf9a3d9951eb922be9"
SRC_URI[sha256sum] = "babfd9ac89810b461c758964b130b80caf92655ba2aac79c7b70d6a232b5849c"

ROS_SPN = "warthog"
S = "${WORKDIR}/warthog-release-release-melodic-warthog_msgs-0.1.1-2"

inherit catkin
