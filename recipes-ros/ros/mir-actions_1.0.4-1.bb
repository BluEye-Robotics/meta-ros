DESCRIPTION = "Action definitions for the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib geometry-msgs nav-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_actions/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b65bf84c95a75bdcf25b3d5513266386"
SRC_URI[sha256sum] = "aaf73d32129e1084e5460ae1c6279641d6ee78931c8d05e89aa943836d79807c"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_actions-1.0.4-1"

inherit catkin
