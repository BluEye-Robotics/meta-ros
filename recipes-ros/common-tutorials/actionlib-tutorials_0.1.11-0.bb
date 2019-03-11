DESCRIPTION = "The actionlib_tutorials package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"
SRC_URI[md5sum] = "9c509b166ae2c6c78c009c83d33694d7"
SRC_URI[sha256sum] = "7047d449482c347110d391bd3aec0ba21c28ec04578996c93c3607afcd9534a1"

DEPENDS = "roscpp actionlib message-generation std-msgs actionlib-msgs"

require common-tutorials.inc

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_BPN}"
