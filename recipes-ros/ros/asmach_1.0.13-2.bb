DESCRIPTION = "SMACH, which stands for 'state machine', is a task-level architecture for rapidly creating complex robot behavior. At its core, SMACH is a ROS-independent Python library to build hierarchical state machines. SMACH is a new library that takes advantage of very old concepts in order to quickly create robust robot behavior with maintainable and modular code."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/asmach/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3ebc6f869fc5f2f982676740eac61aa5"
SRC_URI[sha256sum] = "67a3b18eccdf4d0a02c7459cb3af8c367f16bc45a0dcfb66f84c293b618e30e1"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-asmach-1.0.13-2"

inherit catkin
