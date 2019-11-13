DESCRIPTION = "Move Base Flex (MBF) is a backwards-compatible replacement for move_base. MBF can use existing plugins for move_base, and provides an enhanced version of the planner, controller and recovery plugin ROS interfaces. It exposes action servers for planning, controlling and recovering, providing detailed information of the current state and the plugin’s feedback. An external executive logic can use MBF and its actions to perform smart and flexible navigation strategies. Furthermore, MBF enables the use of other map representations, e. g. meshes or grid_map This package is a meta package and refers to the Move Base Flex stack packages. The abstract core of MBF – without any binding to a map representation – is represented by the"
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mbf-abstract-core mbf-abstract-nav mbf-costmap-core mbf-costmap-nav mbf-msgs mbf-simple-nav"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/move_base_flex/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "22348be77f0b618ed80649847b6b3893"
SRC_URI[sha256sum] = "69c419020bc835705d5f93b2a1f12cd151577b12d4bbd0bccdbce7e47e29e061"

S = "${WORKDIR}/move_base_flex-release-release-melodic-move_base_flex-0.2.5-1"

inherit catkin
