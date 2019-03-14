DESCRIPTION = "this package contains a set of messages that are used by the introspection interfaces for smach."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/melodic/smach_msgs/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6a4c427b860e7f367632a0df908f19e"
SRC_URI[sha256sum] = "b42e7a31e5e9ee3fcec7388566ca1a78d2af773c2e0bc7428d4f2d62ed732bcf"

ROS_SPN = "executive_smach"
S = "${WORKDIR}/executive_smach-release-release-melodic-smach_msgs-2.0.1-0"

inherit catkin
