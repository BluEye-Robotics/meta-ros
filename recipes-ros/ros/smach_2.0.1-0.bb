DESCRIPTION = "SMACH is a task-level architecture for rapidly creating complex robot behavior. At its core, SMACH is a ROS-independent Python library to build hierarchical state machines. SMACH is a new library that takes advantage of very old concepts in order to quickly create robust robot behavior with maintainable and modular code."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/melodic/smach/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ac99dd8887746c8bf0e6ec04b8724014"
SRC_URI[sha256sum] = "37de5727c98e7aa222670ad40229cfe239e2907f25ec0d7133b4ec2c29eb6c7c"

ROS_SPN = "executive_smach"
S = "${WORKDIR}/executive_smach-release-release-melodic-smach-2.0.1-0"

inherit catkin
