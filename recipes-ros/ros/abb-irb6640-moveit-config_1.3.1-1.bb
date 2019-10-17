DESCRIPTION = ""
AUTHOR = "MoveIt Setup Assistant"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-simple-controller-manager moveit-planners-ompl moveit-ros-visualization joint-state-publisher robot-state-publisher moveit-ros-move-group xacro industrial-robot-simulator abb-irb6640-support"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb6640_moveit_config/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5788f11999f7718dde38ff7afa963ac5"
SRC_URI[sha256sum] = "d682a66da0b4bee804900df9e877fb3543824e3b8eb4bf46bea001066894152e"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb6640_moveit_config-1.3.1-1"

inherit catkin
