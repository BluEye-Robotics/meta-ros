DESCRIPTION = "Message definitions for the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_msgs/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ce002ec5b57acd493cc02e317e47012"
SRC_URI[sha256sum] = "60ccda62899a4d92718a5a4074e21faa865d2ee0c53d33730ff367c6bf402f38"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_msgs-1.0.4-1"

inherit catkin
