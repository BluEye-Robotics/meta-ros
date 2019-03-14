DESCRIPTION = "This package provides common interfaces for navigation specific robot actions. It contains the CostmapPlanner, CostmapController and CostmapRecovery interfaces. The interfaces have to be implemented by the plugins to make them available for Move Base Flex using the mbf_costmap_nav navigation implementation. That implementation inherits the mbf_abstract_nav implementation and binds the system to a local and a global costmap."
AUTHOR = "Jorge Santos"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "costmap-2d geometry-msgs mbf-abstract-core mbf-utility nav-core std-msgs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_costmap_core/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "907db4f0c1abcef72c222068d4cdb525"
SRC_URI[sha256sum] = "99c4b3f406d65d71f039477cd8f153e4514c064ef30fcba5e10e582cc3b15d66"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_costmap_core-0.2.3-0"

inherit catkin
