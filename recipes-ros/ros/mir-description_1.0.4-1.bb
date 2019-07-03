DESCRIPTION = "URDF description of the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "diff-drive-controller gazebo-ros-control joint-state-controller joint-state-publisher position-controllers robot-state-publisher  urdf xacro"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_description/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b206c6f29b871ee83766516da48814e"
SRC_URI[sha256sum] = "75e85e0254228274ed31f3f39461d07ea16571e44b55b5714ed2d5c4257c81be"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_description-1.0.4-1"

inherit catkin
