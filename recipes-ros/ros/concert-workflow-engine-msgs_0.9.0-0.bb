DESCRIPTION = "Messages used by workflow engine"
AUTHOR = "Dongwook Lee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/concert_workflow_engine_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f97827b29688829d8741ab3f3756563c"
SRC_URI[sha256sum] = "2911128ce6bda4648b1264133cbcd10cb6be12c413bd50523089ff9e93699a0a"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-concert_workflow_engine_msgs-0.9.0-0"

inherit catkin
