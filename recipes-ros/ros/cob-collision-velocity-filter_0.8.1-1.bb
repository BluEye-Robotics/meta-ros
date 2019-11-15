DESCRIPTION = "The cob_collision_velocity_filter package is a package for collision avoidance using teleoperation."
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost cob-footprint-observer costmap-2d dynamic-reconfigure geometry-msgs nav-msgs roscpp tf tf2-ros visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_collision_velocity_filter/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc62be5f470a665b68acb611ff3700f9"
SRC_URI[sha256sum] = "167363d3942a00dccba154510dbaf68cecd2b08f4b404490797c867ac9a0561f"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_collision_velocity_filter-0.8.1-1"

inherit catkin
