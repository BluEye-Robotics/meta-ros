DESCRIPTION = "Trajectory critics for the dwb_local_planner that work well together with the SBPL global planner on the MiR robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles costmap-queue dwb-critics dwb-local-planner geometry-msgs nav-2d-msgs nav-2d-utils nav-core2 nav-grid-iterators pluginlib roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_dwb_critics/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "668d82e44b20faf07e41b76c42dc1f5e"
SRC_URI[sha256sum] = "72ef1187b0c85ee0de3f41cf602bb84854fbfdfb65422ea25b44d9e70b6b76f4"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_dwb_critics-1.0.4-1"

inherit catkin
