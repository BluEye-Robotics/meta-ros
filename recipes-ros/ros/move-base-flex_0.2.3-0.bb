DESCRIPTION = "Move Base Flex (MBF) is a backwards-compatible replacement for move_base. MBF can use existing plugins for move_base, and provides an enhanced version of the planner, controller and recovery plugin ROS interfaces. It exposes action servers for planning, controlling and recovering, providing detailed information of the current state and the plugin’s feedback. An external executive logic can use MBF and its actions to perform smart and flexible navigation strategies. Furthermore, MBF enables the use of other map representations, e. g. meshes or grid_map This package is a meta package and refers to the Move Base Flex stack packages. The abstract core of MBF – without any binding to a map representation – is represented by the"
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mbf-abstract-core mbf-abstract-nav mbf-costmap-core mbf-costmap-nav mbf-msgs mbf-simple-nav"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/move_base_flex/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ce8afbfba02e3fbce1091f24842f4d51"
SRC_URI[sha256sum] = "6884710e99fcf15389f67610d3ed2437fc16087bcb8cedfe5e511fb449b41bcb"

S = "${WORKDIR}/move_base_flex-release-release-melodic-move_base_flex-0.2.3-0"

inherit catkin
