DESCRIPTION = "ROS messages for universally unique identifiers."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/melodic/uuid_msgs/1.0.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f4648546d9f9ad348ec077c524f5222"
SRC_URI[sha256sum] = "c00cacdbfc12e1cc2715a8531eae1fc69700362b2abab974d03d70de5de6d2b5"

ROS_SPN = "unique_identifier"
S = "${WORKDIR}/unique_identifier-release-release-melodic-uuid_msgs-1.0.6-0"

inherit catkin
