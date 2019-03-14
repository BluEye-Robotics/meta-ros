DESCRIPTION = "This package contains the xxx. machine files that describe the different hosts a node can be spawned on. Currently there is one machine file for the pr2 robot, and one for the simulated pr2 robot."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_machine/1.12.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e8f88a9bb3fb88e9828e2c7952e6aeaf"
SRC_URI[sha256sum] = "6f00fa41d1506fb75a2fedc3beabf6d3811d73c8a8a4da211714e3591f458021"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_machine-1.12.3-0"

inherit catkin
