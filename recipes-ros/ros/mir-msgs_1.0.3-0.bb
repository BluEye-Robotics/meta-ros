DESCRIPTION = "Message definitions for the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_msgs/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8fa4ee6a5a9fec2b7f7580e26f2226d7"
SRC_URI[sha256sum] = "c4d63d427acace6162d68513c68fc64da0d5631be84c81ac6193ea339ec163f0"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_msgs-1.0.3-0"

inherit catkin
