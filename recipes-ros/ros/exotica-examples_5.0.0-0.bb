DESCRIPTION = "Package containing examples and system tests for EXOTica."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core exotica-core-task-maps exotica-python exotica-aico-solver exotica-ik-solver sensor-msgs"

RDEPENDS_${PN} = "exotica-collision-scene-fcl exotica-ompl-solver exotica-time-indexed-rrt-connect-solver robot-state-publisher  geometry-msgs visualization-msgs interactive-markers python3-orocos-kdl"

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_examples/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9d76d9808bdb9f89a6aadc7a55b7e2f5"
SRC_URI[sha256sum] = "29b1331e8e4ea4183064803a44e6e438b638c4d5c1c4927ea3d93d79dd29c325"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_examples-5.0.0-0"

inherit catkin
