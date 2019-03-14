DESCRIPTION = "A bond allows two processes, A and B, to know when the other has terminated, either cleanly or by crashing. The bond remains connected until it is either broken explicitly or until a heartbeat times out."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/melodic/bond/1.8.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "baa7be5fced449699a1f5bb5908f4be3"
SRC_URI[sha256sum] = "6a9f5fb5b44ce6285800177903b4364061521de47bda8cd8902814405aac83f4"

ROS_SPN = "bond_core"
S = "${WORKDIR}/bond_core-release-release-melodic-bond-1.8.3-0"

inherit catkin
