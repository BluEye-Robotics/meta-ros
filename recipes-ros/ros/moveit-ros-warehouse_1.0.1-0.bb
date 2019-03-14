DESCRIPTION = "Components of MoveIt! connecting to MongoDB"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "warehouse-ros moveit-ros-planning roscpp rosconsole tf2-eigen tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_warehouse/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2e26d97a54c3160c7b4f14d63bf50f25"
SRC_URI[sha256sum] = "f2200ad880c214ba2af00fb36d58740509ca51efc0e6213b2fc4615005230baf"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_warehouse-1.0.1-0"

inherit catkin
