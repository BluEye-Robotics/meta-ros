DESCRIPTION = "SMACH, which stands for 'state machine', is a task-level architecture for rapidly creating complex robot behavior. At its core, SMACH is a ROS-independent Python library to build hierarchical state machines. SMACH is a new library that takes advantage of very old concepts in order to quickly create robust robot behavior with maintainable and modular code."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/asmach/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "918620b96a49b5e1ea58f36b82f3a1ba"
SRC_URI[sha256sum] = "b7eeea554c6038f5c55ebb8a91973c24e8cdb3e20d71ceac5b7d6617b5316952"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-asmach-1.0.16-1"

inherit catkin
