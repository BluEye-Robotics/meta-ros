DESCRIPTION = "Message definitions for planner_cspace package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/planner_cspace_msgs/0.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd0a5e55299922a373c1f2dab0a68a76"
SRC_URI[sha256sum] = "8dc9117831302c78719153d5a301078e9d9c14f4acf31689516a0164324774fa"

ROS_SPN = "neonavigation_msgs"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-planner_cspace_msgs-0.3.1-0"

inherit catkin
