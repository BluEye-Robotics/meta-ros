DESCRIPTION = "Action definitions for the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib geometry-msgs nav-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_actions/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2244ee92ab597b00b7c25a30ff4e402b"
SRC_URI[sha256sum] = "7a98d3c84c4620fd3f311c2419aec7a9f25eb2bf432373316cabeb5198e5dc6d"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_actions-1.0.3-0"

inherit catkin
