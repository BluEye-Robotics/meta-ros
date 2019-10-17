DESCRIPTION = "Components of MoveIt! connecting to MongoDB"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "warehouse-ros moveit-ros-planning roscpp rosconsole tf2-eigen tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_warehouse/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6c0399ba126ecd86493f38313dd4bc8d"
SRC_URI[sha256sum] = "6170d8dc44945f1f314818a9bf4e14420f5966b38be89893ab9e91cddda3877e"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_warehouse-1.0.2-1"

inherit catkin
