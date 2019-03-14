DESCRIPTION = "URDF description of the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "diff-drive-controller gazebo-ros-control joint-state-controller joint-state-publisher position-controllers robot-state-publisher  urdf xacro"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_description/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7374e902a3742e801cb63864efe4117"
SRC_URI[sha256sum] = "1673a6c78f1655851cd913be6057e0d5eeedf8c77ff1d22fa5a639cf6f22a522"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_description-1.0.3-0"

inherit catkin
