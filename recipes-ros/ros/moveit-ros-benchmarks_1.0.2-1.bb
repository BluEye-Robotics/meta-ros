DESCRIPTION = "Enhanced tools for benchmarks in MoveIt!"
AUTHOR = "Ryan Luna"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-ros-planning moveit-ros-warehouse roscpp tf2-eigen pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_benchmarks/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "206220ded7553d21b004cc5f1c79ea72"
SRC_URI[sha256sum] = "4d739a977e815a45a45542b52f31244a1755d4e4df62d68399d5bada565e3fed"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_benchmarks-1.0.2-1"

inherit catkin
