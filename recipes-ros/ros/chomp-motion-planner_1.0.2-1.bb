DESCRIPTION = "chomp_motion_planner"
AUTHOR = "Gil Jones"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp moveit-core"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/chomp_motion_planner/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e19852d5f1393237673cb0ed24fe9410"
SRC_URI[sha256sum] = "3bb6111f5f09f08aab5941a388925b99ab2506940210739a9b80e2ac4578079d"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-chomp_motion_planner-1.0.2-1"

inherit catkin
