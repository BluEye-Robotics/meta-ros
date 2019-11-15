DESCRIPTION = "This package provides common interfaces for navigation specific robot actions. It contains the AbstractPlanner, AbstractController and AbstractRecovery plugin interfaces. This interfaces have to be implemented by the plugins to make the plugin available for Move Base Flex. The abstract classes provides a meaningful interface enabling the planners, controllers and recovery behaviors to return information, e. g. why something went wrong. Derivided interfaces can, for example, provide methods to initialize the planner, controller or recovery with map representations like costmap_2d, grid_map or other representations."
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "geometry-msgs std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_abstract_core/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf53286ba8c4b5818d8807bdb71bdd52"
SRC_URI[sha256sum] = "28c8b32a8305de2e0edea5f6cbae3c08b65009c29884a3c02c13fcefac0982c6"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_abstract_core-0.2.5-1"

inherit catkin
