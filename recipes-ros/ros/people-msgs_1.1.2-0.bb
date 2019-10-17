DESCRIPTION = "Messages used by nodes in the people stack."
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people_msgs/1.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "50374d01b2fcb427e7d9fc9ca1138ffd"
SRC_URI[sha256sum] = "37885342c0d98ce64a2bfd0f0145edc510220564fdea1284c496e28b848f36d7"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-people_msgs-1.1.2-0"

inherit catkin
