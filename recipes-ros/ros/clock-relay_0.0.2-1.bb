DESCRIPTION = "Specialization of message_relay for clock"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-relay rosgraph-msgs roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/clock_relay/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "88ab31858a7f73b2a9b3327818908bea"
SRC_URI[sha256sum] = "a140af11ea9143aa079d55b89c5513c147715041e024fa1cf6f35cd43b1a6fff"

ROS_SPN = "cpr_multimaster_tools"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-melodic-clock_relay-0.0.2-1"

inherit catkin
